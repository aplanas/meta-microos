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

RPM_NAME = "python39-rope-1.9.0-1.1.noarch.rpm"
RPM_HASH = "6bc7b0a198844353e2f68c6eec7e122564f4c11652eea98d8437fd9aeb7fd0b123a78b5b20af4884fd51348aa8509f8c809e026d01d41f72d86833cc08c08713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rope \
python39-rope \
python3dist-rope"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-pytoolconfig-global"

inherit rpm
