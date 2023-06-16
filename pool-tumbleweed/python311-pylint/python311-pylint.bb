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

RPM_NAME = "python311-pylint-2.17.4-2.1.noarch.rpm"
RPM_HASH = "db57909831acf6ddec90dcbab48ab40bfbf649871f2c278b0e0b6b02dfc9c92445286295b3b62ffb81575e43f5c826cb1bdac65ce776065c3ff837d6befb66f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pylint \
python311-pylint \
python3dist-pylint"

RDEPENDS:${PN} += "-python311-astroid >= 2.15.4 with python311-astroid < 2.17.0~dev0 \
-python311-isort >= 4.2.5 with python311-isort < 6 \
-python311-mccabe >= 0.6 with python311-mccabe < 0.8 \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-dill \
python311-platformdirs \
python311-tomlkit \
update-alternatives"

inherit rpm
