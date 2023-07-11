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

RPM_NAME = "python311-pytest-django-4.5.2-5.1.noarch.rpm"
RPM_HASH = "f0d827886caad7e6405bab69406089ed0b0ca0c52344d30aff79693445da94f99c7c76fcad98f52e331f7ba610072d3de5f88d08d4fbd6ffd8abb4295649eb62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-django \
python3.11dist-pytest-django \
python311-pytest-django \
python3dist-pytest-django"

RDEPENDS:${PN} += "python-abi \
python311-Django \
python311-pytest"

inherit rpm
