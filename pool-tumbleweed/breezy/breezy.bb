SUMMARY = "Distributed version control system with multi-format support"
DESCRIPTION = "Breezy is a version control system implemented in Python with \
multi-format support. Breezy has built-in support for the Git and \
Bazaar file formats and network protocols."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.2"

RPM_NAME = "breezy-3.3.2-1.1.aarch64.rpm"
RPM_HASH = "00601e766d70bfb4ea26b57b0de6413c1dbad8cab3929b779c7af20915f7cda59486d6b96380d6361a812ddf8fcc4120961fd9e5401980da7b7067179053f65c"

RPROVIDES:${PN} += "breezy \
bzr \
python3.10dist-breezy \
python3dist-breezy"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
python-abi \
python3-PyYAML \
python3-configobj \
python3-dulwich \
python3-fastbencode \
python3-fastimport \
python3-merge3 \
python3-patiencediff"

inherit rpm
