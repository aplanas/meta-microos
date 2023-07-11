SUMMARY = "Python bindings for developing with libbtrfsutil"
DESCRIPTION = "This package contains the python bindings to build applications to interface \
with Btrfs using libbtrfsutil."
LICENSE = "GPL-2.0-only"

PV = "6.3"

RPM_NAME = "python-btrfsutil-6.3-2.2.aarch64.rpm"
RPM_HASH = "53440429d4796295adc0c33c5053103ede78d323510ee6ce218088eff3a129083f6ca46dff82b6d2f68bcc2046b9211fd4bf1c7c554902177eab8872da1b0fb3"

RPROVIDES:${PN} += "python-btrfsutil \
python3.11dist-btrfsutil \
python3dist-btrfsutil"

RDEPENDS:${PN} += "btrfsprogs \
ld-linux-aarch64.so.1 \
libbtrfsutil.so.1 \
libbtrfsutil1 \
libc.so.6 \
python-abi \
python3"

inherit rpm
