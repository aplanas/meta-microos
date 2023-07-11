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

RPM_NAME = "python39-pytest-django-4.5.2-5.1.noarch.rpm"
RPM_HASH = "4723008c7c19ab8a0ce5bcf255c2422cd24239ccd5d1427f855658550941815ca8cdc7c03de2ba1520faa193bf9e2b605855e61c4cc78c935b9680fdde875c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-django \
python39-pytest-django \
python3dist-pytest-django"

RDEPENDS:${PN} += "python-abi \
python39-Django \
python39-pytest"

inherit rpm
