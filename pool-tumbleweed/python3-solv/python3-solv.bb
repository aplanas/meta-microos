SUMMARY = "Python3 bindings for the libsolv library"
DESCRIPTION = "Python3 bindings for libsolv."
LICENSE = "BSD-3-Clause"

PV = "0.7.24"

RPM_NAME = "python3-solv-0.7.24-1.3.aarch64.rpm"
RPM_HASH = "313cc0f917ecdd156697b2f770814dd508b0012aa8a705430574f512e729d3967775caecc24ec6bd5dfbd228f9d789b94205b479d731d9de52b1189b43f32937"

RPROVIDES:${PN} += "python3-solv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
librpm.so.9 \
librpmio.so.9 \
libxml2.so.2 \
libz.so.1 \
libzstd.so.1 \
python-abi"

inherit rpm
