SUMMARY = "Library implementing GTP between SGSN and GGSN"
DESCRIPTION = "libgtp implements the GPRS Tunneling Protocol between SGSN and GGSN."
LICENSE = "GPL-2.0-only"

PV = "1.10.1"

RPM_NAME = "libgtp6-1.10.1-1.2.aarch64.rpm"
RPM_HASH = "8a45a9e91572d51ad6c07c3fd38c28b67f870f3f1b52e2addef88e4e2fa61aaa847cbf8b0aa9a00010837e7ca779e08ebae19cce8c885758495677f47b3b3ae6"

RPROVIDES:${PN} += "libgtp.so.6 \
libgtp6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libtalloc.so.2"

inherit rpm
