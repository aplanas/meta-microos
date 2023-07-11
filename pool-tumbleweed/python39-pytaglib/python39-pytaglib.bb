SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytaglib-1.5.0-1.7.aarch64.rpm"
RPM_HASH = "2fb39efdec826c8c89b7841b86697ee558c5601c1794f0966ebe81465a9eea2fc7f6dc4e4f1b304966a0ff806f2a05e5f2e0e51627dc0e9e0503ef8e41798917"

RPROVIDES:${PN} += "python3.9dist-pytaglib \
python39-pytaglib \
python3dist-pytaglib"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtag.so.1 \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
