SUMMARY = "Development files for the libbd_crypto plugin/library"
DESCRIPTION = "This package contains header files and pkg-config files needed for development \
with the libbd_crypto plugin/library.."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_crypto-devel-2.28-1.6.aarch64.rpm"
RPM_HASH = "2651814b8c4fcaa79529ee2cd5ca12a7cefabf19f238cdcf1c376157832344538b6164a58983c713a7c9ee74eca803ca2475189c4e82064e079e1b6f6a76d041"

RPROVIDES:${PN} += "libbd-crypto-devel \
libblockdev-crypto-devel"

RDEPENDS:${PN} += "glib2-devel \
libbd-crypto2"

inherit rpm
