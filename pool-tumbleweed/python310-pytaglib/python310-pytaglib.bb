SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytaglib-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "5d1933b3e0bf5a9680caed8cccb7fd7221c352523d15639241895b789016ce3a8e338603a8b9d5a66b819290791e171b96f2de4c0ac46ce2966271a8a21492cb"

RPROVIDES:${PN} += "python3-pytaglib \
python3.10dist-pytaglib \
python310-pytaglib \
python3dist-pytaglib"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1 \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
