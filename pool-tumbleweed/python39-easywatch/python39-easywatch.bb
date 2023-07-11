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

RPM_NAME = "python39-easywatch-0.0.5-2.18.noarch.rpm"
RPM_HASH = "33035d2a480b19d7cd96b11f0758855b5b4f4f9eafff31c5a9d3a9ae142951094221a45a128877acf1d519b5ab57e3e31cb81bd40156c8d0a2b1fe65798d9c04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-easywatch \
python39-easywatch \
python3dist-easywatch"

RDEPENDS:${PN} += "python-abi \
python39-watchdog"

inherit rpm
