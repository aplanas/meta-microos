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

RPM_NAME = "python311-rope-1.9.0-1.1.noarch.rpm"
RPM_HASH = "ca250b09af78a345b293c59cc1f81a152bdc2995b520e44ada7dea2805549d6551eb08d7d4cb3bcda286e80afd058b9edec7b7944eb80e0eeeda9d17e7a44126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rope \
python3.11dist-rope \
python311-rope \
python3dist-rope"

RDEPENDS:${PN} += "python-abi \
python311 \
python311-pytoolconfig-global"

inherit rpm
