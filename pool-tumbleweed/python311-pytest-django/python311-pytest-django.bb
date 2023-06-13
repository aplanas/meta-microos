SUMMARY = "A Django plugin for Pytest"
DESCRIPTION = "pytest-django allows testing Django projects/applications with the \
pytest testing tool. \
 \
Running the test suite with pytest-django allows tapping into the features \
that are already present in pytest: \
 \
* Manage test dependencies with pytest fixtures. \
* Less boilerplate tests: no need to import unittest and creating a \
  subclass with methods. Tests can be written as regular functions. \
* Database re-use: no need to re-create the test database for every test run. \
* Run tests in multiple processes for increased speed (with the pytest-xdist plugin). \
* Make use of other pytest plugins. \
* Works with both worlds: Existing unittest-style TestCase's still work without any modifications."
LICENSE = "BSD-3-Clause"

PV = "4.5.2"

RPM_NAME = "python311-pytest-django-4.5.2-4.4.noarch.rpm"
RPM_HASH = "23c368c2fe9e56a53e6ab1a0d7054ecf2bd1f6fc34fe08c255e9182a1db0bf71e487df84859b6aef207824d1ac6f86b58a636664a9092c1da1a4b1c5fbc38f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-django) \
python311-pytest-django \
python3dist(pytest-django)"

RDEPENDS:${PN} += "python(abi) \
python311-Django \
python311-pytest"

inherit rpm
