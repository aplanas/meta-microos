SUMMARY = "A python refactoring library"
DESCRIPTION = "Rope is a python refactoring library. \
 \
* Rope aims to provide powerful and safe refactoring \
* Rope is light on dependency, Rope only depends on Python itself \
* Unlike PyRight or PyLance, Rope does not depend on Node.js \
* Unlike PyLance or PyCharm, Rope is open source. \
* Unlike PyRight and PyLance, Rope is written in Python itself, \
  so if you experience problems, you would be able to debug and \
  hack it yourself in a language that you are already familiar with \
* In comparison to Jedi, Rope is focused on refactoring. While Jedi \
  provides some basic refactoring capabilities, Rope supports many \
  more advanced refactoring operations and options that Jedi does not."
LICENSE = "LGPL-3.0-or-later"

PV = "1.9.0"

RPM_NAME = "python310-rope-1.9.0-1.1.noarch.rpm"
RPM_HASH = "dd8c0f2bba046ee2b507d5f24b1697060a75a932e37f8ff6b8c822b9782f7b416729ab0b89e7a36534b5c0229c4113d175ab8b1ca4af4dc33f57abe92b16035d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-rope \
python310-rope \
python3dist-rope"

RDEPENDS:${PN} += "python-abi \
python310 \
python310-pytoolconfig-global"

inherit rpm
