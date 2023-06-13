SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "1.5.0"

RPM_NAME = "python39-pytaglib-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "c994d691f75af82a4e989e6c4d0f73d4f61acb4e6a67cc44031694993e70270707ab7a5d03bc76f68e326e6388b15a64271ec85b6e5120eda0e227071b30eb65"

RPROVIDES:${PN} += "python3.9dist(pytaglib) \
python39-pytaglib \
python39-pytaglib(aarch-64) \
python3dist(pytaglib)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libtag.so.1()(64bit) \
python(abi) \
python39-setuptools \
update-alternatives"

inherit rpm
