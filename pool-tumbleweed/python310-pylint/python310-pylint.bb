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

RPM_NAME = "python310-pylint-2.17.4-2.1.noarch.rpm"
RPM_HASH = "fd2158d80bc807145582520d128cab5d995114d7b21de7bf284d1a7dbd45b8cc6fd4f861b48653fd332fa996554e127b13762b6470c061a48ea54c854df26d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pylint \
python3.10dist(pylint) \
python310-pylint \
python3dist(pylint)"

RDEPENDS:${PN} += "(python310-astroid >= 2.15.4 with python310-astroid < 2.17.0~dev0) \
(python310-isort >= 4.2.5 with python310-isort < 6) \
(python310-mccabe >= 0.6 with python310-mccabe < 0.8) \
/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-dill \
python310-platformdirs \
python310-tomli \
python310-tomlkit \
update-alternatives"

inherit rpm
