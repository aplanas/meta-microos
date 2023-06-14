SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2023.4.22"

RPM_NAME = "python311-nox-2023.4.22-1.1.noarch.rpm"
RPM_HASH = "c695d211915bc07a67f9a6899caeb2627886464ed36b4a06512b97e85ad79aa6c3abd3a1b8878736c5b541ce47ff8f70ead80275e7814290531a5b39a89224ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-nox \
python311-nox \
python3dist-nox"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-argcomplete \
python311-colorlog \
python311-setuptools \
python311-virtualenv \
update-alternatives"

inherit rpm
