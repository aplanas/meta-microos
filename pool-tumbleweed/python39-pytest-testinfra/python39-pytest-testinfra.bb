SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python39-pytest-testinfra-8.1.0-1.1.noarch.rpm"
RPM_HASH = "3d540fc956793bf64aac410231ec3626c4525c54f43f41fbebf9733f7f4c9d6cb7cf206dac9dabe32ece032b6392a83c169bf1908645e937b55611d1a25ea937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-testinfra) \
python39-pytest-testinfra \
python39-testinfra \
python3dist(pytest-testinfra)"
RDEPENDS:${PN} += "python(abi) \
python39-pytest"

inherit rpm
