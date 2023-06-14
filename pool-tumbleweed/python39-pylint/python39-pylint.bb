SUMMARY = "Syntax and style checker for Python code"
DESCRIPTION = "Pylint analyzes Python source code looking for bugs and signs of poor \
quality. \
 \
Pylint is a python tool that checks if a module satisfies a coding \
standard. Pylint can be seen as another PyChecker since nearly all \
tests you can do with PyChecker can also be done with Pylint. But \
Pylint offers some more features, like checking line-code's length, \
checking if variable names are well-formed according to your coding \
standard, or checking if declared interfaces are truly implemented, and \
much more (see the complete check list). \
 \
The big advantage with Pylint is that it is highly configurable, \
customizable, and you can easily write a small plugin to add a personal \
feature."
LICENSE = "GPL-2.0-or-later"

PV = "2.17.4"

RPM_NAME = "python39-pylint-2.17.4-2.1.noarch.rpm"
RPM_HASH = "df5d1561e7db2a7b8f7903e55e81e2de076983c928bb950836aff5d89ec6b781859e873b65dc8a2b35fe311b61b41ab7af50ac7073d6f3df61e4533addcdd42b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pylint \
python39-pylint \
python3dist-pylint"

RDEPENDS:${PN} += "-python39-astroid >= 2.15.4 with python39-astroid < 2.17.0~dev0 \
-python39-isort >= 4.2.5 with python39-isort < 6 \
-python39-mccabe >= 0.6 with python39-mccabe < 0.8 \
/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-dill \
python39-platformdirs \
python39-tomli \
python39-tomlkit \
python39-typing-extensions \
update-alternatives"

inherit rpm
