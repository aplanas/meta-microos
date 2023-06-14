SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python310-pytest-testinfra-8.1.0-1.1.noarch.rpm"
RPM_HASH = "93b0f58fd0317949a5dd01c026297a17350b675273880797b8a5bd0de8f5b69266b320f2a474d267b1836a1f8249f7d8745c4d6aecca55f81a0cb84883204a6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-testinfra \
python3-testinfra \
python3.10dist-pytest-testinfra \
python310-pytest-testinfra \
python310-testinfra \
python3dist-pytest-testinfra"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
