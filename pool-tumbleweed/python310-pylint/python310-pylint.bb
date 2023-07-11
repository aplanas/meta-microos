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

RPM_NAME = "python310-pylint-2.17.4-2.3.noarch.rpm"
RPM_HASH = "b616566e219aa24a35ed0b42b6bbade207107796502fd4b73776e1c3ebd42063a4639c16aec937492a3f4e744762f8d31e01ac91c23754a8e2a7ca728127c785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pylint \
python310-pylint \
python3dist-pylint"

RDEPENDS:${PN} += "-python310-astroid >= 2.15.4 with python310-astroid < 2.17.0~dev0 \
-python310-isort >= 4.2.5 with python310-isort < 6 \
-python310-mccabe >= 0.6 with python310-mccabe < 0.8 \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-dill \
python310-platformdirs \
python310-tomli \
python310-tomlkit \
update-alternatives"

inherit rpm
