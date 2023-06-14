SUMMARY = "Python packages license list"
DESCRIPTION = "Dump the software license list of Python packages installed with pip."
LICENSE = "MIT"

PV = "4.3.2"

RPM_NAME = "python311-pip-licenses-4.3.2-1.1.noarch.rpm"
RPM_HASH = "377992c5fe161fe8ac1298fbf1b85560c02ba271e56e8ae1e987224daeff25b808789f0bf0ad10d924e92f29fc98df7c8ec8d66bb6cea9f006f2cb263bede023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pip-licenses \
python311-pip-licenses \
python3dist-pip-licenses"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-PrettyTable \
python311-pip \
update-alternatives"

inherit rpm
