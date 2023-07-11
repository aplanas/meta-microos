SUMMARY = "Metadata 'tagging' library based on TagLib"
DESCRIPTION = "pytaglib is an audio metadata (“tag”) library for Python. \
It relies on the TagLib C++ library."
LICENSE = "GPL-3.0-only | MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytaglib-1.5.0-1.7.aarch64.rpm"
RPM_HASH = "b995e548f58925a18eebd2f802fd454272ed42c67fd7cab560907e2820734df804e938b88eba3b18857d0966065325f122271777525a5a521dfee687071bc541"

RPROVIDES:${PN} += "python3.10dist-pytaglib \
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
