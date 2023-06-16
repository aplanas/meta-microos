SUMMARY = "Python cross-version byte-code disassembler and marshal routines"
DESCRIPTION = "Python cross-version byte-code disassembler and marshal routines."
LICENSE = "GPL-2.0-only"

PV = "6.0.5"

RPM_NAME = "python39-xdis-6.0.5-1.3.noarch.rpm"
RPM_HASH = "b11e069130aacaf45abc687e89ba1c09ca95d9181cf0685780820bb99915ed9b6b0b9f382f9e42849b55440b01ec8bc5eb634f96066138f753c3bb63a811e0cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xdis \
python39-xdis \
python3dist-xdis"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-setuptools \
python39-six \
update-alternatives"

inherit rpm
