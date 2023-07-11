SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python310-pytest-testinfra-8.1.0-1.2.noarch.rpm"
RPM_HASH = "3c9378ce19bbd77a680f5eb94159135995f2a27a86ce6f3cab5415ed9bb099d14818f1af8a617c14a051988a60c06ee55e4a5876e504539adbaaf0add2690b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-testinfra \
python310-pytest-testinfra \
python310-testinfra \
python3dist-pytest-testinfra"

RDEPENDS:${PN} += "python-abi \
python310-pytest"

inherit rpm
