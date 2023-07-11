SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "1.8.4"

RPM_NAME = "python310-python-pam-1.8.4-1.16.noarch.rpm"
RPM_HASH = "fdf2acc79f5b6ccfc4468fee3bf86788cbf060e91d67621302f17f6a09b9ca21f774b108c46816b563838aab13207f789d055442ed7da462e3c4c4eeafcb6e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-pam \
python310-python-pam \
python3dist-python-pam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
