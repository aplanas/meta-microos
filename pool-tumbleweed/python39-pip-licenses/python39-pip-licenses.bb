SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python39-pip-licenses-4.3.2-1.1.noarch.rpm"
RPM_HASH = "54f44d07da71e0f5a6e942ec44c48ba34fab9b36feafe1140c50e6810d8d493217e0da1f89d146cc329a789315445075a4c3de029ac812cb1270a89c37625440"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pip-licenses) \
python39-pip-licenses \
python3dist(pip-licenses)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-PrettyTable \
python39-pip \
update-alternatives"

inherit rpm
