SUMMARY = "Directory monitoring package for Python"
DESCRIPTION = "Easywatch exports one function, `watch` which watches a directory for \
changes and notifies a handler the type of event and the name of the \
file that triggered it. \
 \
There are four types of events that the handler can be notified about: \
 \
  * created: a file was created \
  * deleted: a file was deleted \
  * modified: a file was modified \
  * moved: a file was moved"
LICENSE = "MIT"

PV = "0.0.5"

RPM_NAME = "python39-easywatch-0.0.5-2.17.noarch.rpm"
RPM_HASH = "beaf72075d2a1a6f8e672061a45a6193cc237630f3c9b672f7cc50cfa2efc3d53a226e17596351f87ab94211bd19924c546ee733908cc6707476b00e7e5203b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(easywatch) \
python39-easywatch \
python3dist(easywatch)"
RDEPENDS:${PN} += "python(abi) \
python39-watchdog"

inherit rpm
