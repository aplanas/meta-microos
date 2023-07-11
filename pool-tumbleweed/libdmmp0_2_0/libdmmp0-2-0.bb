SUMMARY = "C API for multipath-tools"
DESCRIPTION = "This library enables the use of libmultipath commands from C code."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.5+68+suse.d1b6a1c"

RPM_NAME = "libdmmp0_2_0-0.9.5+68+suse.d1b6a1c-1.2.aarch64.rpm"
RPM_HASH = "8cc270f542dd8658b47c4288c8fac0ea2072186eabc69d64b46dbce279e2f765798353bc54549cfae18128ba877a7abaf9bb7f2a6364e2fc398e4b448838a48c"

RPROVIDES:${PN} += "libdmmp.so.0.2.0 \
libdmmp0-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjson-c.so.5 \
libmpathcmd.so.0 \
multipath-tools"

inherit rpm
