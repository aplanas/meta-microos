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

RPM_NAME = "python310-pytest-django-4.5.2-5.1.noarch.rpm"
RPM_HASH = "91f36c74b5780c9b0e57b0527ddc60dc4cb2af2e62b91b9ded25ea0b9b68fa420511331cd34a8ff2b9b0111ddab57dc18a9ed19ff327fc9fd7f07c0b67ed5aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-django \
python310-pytest-django \
python3dist-pytest-django"

RDEPENDS:${PN} += "python-abi \
python310-Django \
python310-pytest"

inherit rpm
