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

PV = "1.6.0"

RPM_NAME = "python39-rope-1.6.0-1.6.noarch.rpm"
RPM_HASH = "a0b51811fb438637eddc2a0953afd7976147497f913256e6f1390e94bc3fefcede46e4889de8684f6a50df5c9e883e6fb86a0556fff989fe370749b2fa196043"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-rope \
python39-rope \
python3dist-rope"

RDEPENDS:${PN} += "python-abi \
python39 \
python39-pytoolconfig-global"

inherit rpm
