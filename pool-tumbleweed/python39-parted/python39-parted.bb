SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.0"

RPM_NAME = "python39-parted-3.12.0-3.1.aarch64.rpm"
RPM_HASH = "7a150bccd4e58de99db8cad2495d6d9bd6590e920ae99c2f28721d66a76dab9a9c120e0c322350c96abc48ab8d7924d3de7f9f70de6f49029686112d709f9d8b"

RPROVIDES:${PN} += "python3.9dist(pyparted) \
python39-parted \
python39-parted(aarch-64) \
python3dist(pyparted)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libparted.so.2()(64bit) \
parted \
python(abi)"

inherit rpm
