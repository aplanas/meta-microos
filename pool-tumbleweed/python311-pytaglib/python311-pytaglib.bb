SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "1.5.0"

RPM_NAME = "python311-pytaglib-1.5.0-1.7.aarch64.rpm"
RPM_HASH = "5abc18e3aea902deabff832e4b4e9acb8d3df349f388be47b85be9429d68c9953f627111be9734e59d8e87451e32da9653a9f0e33e888b2cb71651e7cf7363d9"

RPROVIDES:${PN} += "python3-pytaglib \
python3.11dist-pytaglib \
python311-pytaglib \
python3dist-pytaglib"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
