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

RPM_NAME = "python310-easywatch-0.0.5-2.18.noarch.rpm"
RPM_HASH = "1b6e34df50bea4f245081c91899106f6d986029d3364abcc595415516bd10327d8217291d2b5ec40a92e6aac1cad144d1053aa66397f0cb5d5ac1cae785f232f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-easywatch \
python310-easywatch \
python3dist-easywatch"

RDEPENDS:${PN} += "python-abi \
python310-watchdog"

inherit rpm
