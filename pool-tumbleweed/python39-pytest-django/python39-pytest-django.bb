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

RPM_NAME = "python39-pytest-django-4.5.2-4.4.noarch.rpm"
RPM_HASH = "7824cfadb562ac8045ea9c8b3ebca48835cd923d3818d13bdd4046bed213cb96f33dfc81ccb74c85242cc6ae2599263499c556aa5893a18fd1490efb3e10e7a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-django) \
python39-pytest-django \
python3dist(pytest-django)"
RDEPENDS:${PN} += "python(abi) \
python39-Django \
python39-pytest"

inherit rpm
