SUMMARY = "Flexible test automation"
DESCRIPTION = "Flexible test automation."
LICENSE = "Apache-2.0"

PV = "2023.4.22"

RPM_NAME = "python310-nox-2023.4.22-1.1.noarch.rpm"
RPM_HASH = "2561efb0bbcb94e9b5109f287dfc8f2e9dc882263c3bca8b9802edc5ae2b8e7acac3e2bd85bd5508d8fe4e9f95ce462c295d1b1d83343eb24edec21dc6f9c4a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nox \
python3.10dist-nox \
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
