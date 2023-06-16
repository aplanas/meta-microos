SUMMARY = "Python library to parse Arch SRCINFO files"
DESCRIPTION = "Python library to parse Arch .SRCINFO files."
LICENSE = "ISC"

PV = "0.1.1"

RPM_NAME = "python310-srcinfo-0.1.1-1.4.noarch.rpm"
RPM_HASH = "4aa9e47cd0c3a3469bc24f90081f127144dbd927c605ac363a5867f4549aad857a49932468b91712b7758d52c0b8325838059d17cfff3da925ac46b108e5fdf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-srcinfo \
python3.10dist-srcinfo \
python310-srcinfo \
python3dist-srcinfo"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-parse \
update-alternatives"

inherit rpm
