SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2023.4.22"

RPM_NAME = "python39-nox-2023.4.22-2.1.noarch.rpm"
RPM_HASH = "8d0044ab4d25e3967cc6f6e27f2d8e4ba21980d7fda7e78d41bca9a9496a2bf984b5b67e780682c4dc17af106d402008bc1c223f64b74032d9bebb1c11e38b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-nox \
python39-nox \
python3dist-nox"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-argcomplete \
python39-colorlog \
python39-setuptools \
python39-virtualenv \
update-alternatives"

inherit rpm
