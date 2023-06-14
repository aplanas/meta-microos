SUMMARY = "Python Module Implementing the ManageSieve Protocol"
DESCRIPTION = "python-managesieve is a Python module implementing the ManageSieve client \
protocol. It also includes an user application (the interactive sieveshell)."
LICENSE = "GPL-3.0-or-later & Python-2.0"

PV = "0.7.1"

RPM_NAME = "python310-managesieve-0.7.1-1.9.noarch.rpm"
RPM_HASH = "ff751aa160d9ac58d2d187422bc7ae1daf992622cfa094ea9297c94aadffcad3f1b9aae76db045f25ed1b98748ba6454fef8e8d1664d17a10a58cc68cfe988f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-managesieve \
python3.10dist-managesieve \
python310-managesieve \
python3dist-managesieve"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
update-alternatives"

inherit rpm
