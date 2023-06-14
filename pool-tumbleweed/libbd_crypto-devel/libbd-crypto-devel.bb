SUMMARY = "Development files for the libbd_crypto plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_crypto plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_crypto-devel-2.28-1.4.aarch64.rpm"
RPM_HASH = "6e293e04ccf9c60e786f6090ddec9f049600434ca143114771bbcbf5a567dffc0bf2beadf6023be53c5a47585b8625e1ca02c2271ff74996be0a9ff581f6a3d1"

RPROVIDES:${PN} += "libbd-crypto-devel \
libblockdev-crypto-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-crypto2"

inherit rpm
