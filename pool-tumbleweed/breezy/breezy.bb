SUMMARY = "Distributed version control system with multi-format support"
DESCRIPTION = "Breezy is a version control system implemented in Python with \
multi-format support. Breezy has built-in support for the Git and \
Bazaar file formats and network protocols."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "breezy-3.3.3-1.2.aarch64.rpm"
RPM_HASH = "b04aad467def420d2b103e586a4bf3b64971876c4c69aa3392066bfe9d65ecd4de07f7fdfe709a298e95568035e5496e14859abbf3dcea5c8c5350acfbc22c55"

RPROVIDES:${PN} += "breezy \
bzr \
python3.11dist-breezy \
python3dist-breezy"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
python-abi \
python3-PyYAML \
python3-configobj \
python3-dulwich \
python3-fastbencode \
python3-fastimport \
python3-merge3 \
python3-patiencediff \
python3-urllib3"

inherit rpm
