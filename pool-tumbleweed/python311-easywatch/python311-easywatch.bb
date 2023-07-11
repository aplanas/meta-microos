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

RPM_NAME = "python311-easywatch-0.0.5-2.18.noarch.rpm"
RPM_HASH = "8b8791b1e51e4f58f9b6f68bc2730b1fdbc8b996a4f16dd735f2d2e5b458801c98df39d6570dd49b5fc3eac0a0f98cd4207d3ecbdbcb64887a7c63edaa6be582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easywatch \
python3.11dist-easywatch \
python311-easywatch \
python3dist-easywatch"

RDEPENDS:${PN} += "python-abi \
python311-watchdog"

inherit rpm
