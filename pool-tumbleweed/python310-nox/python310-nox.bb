SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2023.4.22"

RPM_NAME = "python310-nox-2023.4.22-2.1.noarch.rpm"
RPM_HASH = "2043c4720c4ea42f94b0c5674fe580a8fe50264ebcf062e4487cc54094b1793b76c54b9fb0ac08164084b8cf447ca9d384bc744b2977db8bf3164840591a49a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nox \
python310-nox \
python3dist-nox"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-argcomplete \
python310-colorlog \
python310-setuptools \
python310-virtualenv \
update-alternatives"

inherit rpm
