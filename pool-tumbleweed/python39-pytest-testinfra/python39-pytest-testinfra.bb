SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python39-pytest-testinfra-8.1.0-1.2.noarch.rpm"
RPM_HASH = "304c025d491519f71fb1a2001e6637a82372cff32c41f351f18a5ee03368a9350930b73d0db5fdc4c736745710c99eda36e888395bcb8b162f6ad8a569aacf8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-testinfra \
python39-pytest-testinfra \
python39-testinfra \
python3dist-pytest-testinfra"

RDEPENDS:${PN} += "python-abi \
python39-pytest"

inherit rpm
