SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python311-pytest-testinfra-8.1.0-1.1.noarch.rpm"
RPM_HASH = "b3888a74df9dc818a009486a908281e1e72c1303051c9d7f739e874cff45373d9ef1c7ac224ae8d2a8d25218a6436c7e22c603f64a1001bf3e65452a6ac95fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-testinfra) \
python311-pytest-testinfra \
python311-testinfra \
python3dist(pytest-testinfra)"

RDEPENDS:${PN} += "python(abi) \
python311-pytest"

inherit rpm
