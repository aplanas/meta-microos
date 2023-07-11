SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python311-pytest-testinfra-8.1.0-1.2.noarch.rpm"
RPM_HASH = "febaba871a9c3b39846b0aa87a5e967300efc6b7317596e5264fa198756e2b9cbfabf70472876fb9af74121b69b78dd8d015581289d57cf967457a89af6b0c39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-testinfra \
python3-testinfra \
python3.11dist-pytest-testinfra \
python311-pytest-testinfra \
python311-testinfra \
python3dist-pytest-testinfra"

RDEPENDS:${PN} += "python-abi \
python311-pytest"

inherit rpm
