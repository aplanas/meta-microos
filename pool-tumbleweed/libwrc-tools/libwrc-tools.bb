SUMMARY = "Utilities to inspect Windows Resource Compiler files"
DESCRIPTION = "This subpackage provides the utilities from libwrc, which allows for \
reading Windows Resource Compiler files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-tools-20230318-1.2.aarch64.rpm"
RPM_HASH = "32fa84760f96a248a8523ff88da4762c2930ae72860e4d29653639a002bb12363130f2726033e0458db9b5ddba7abadc3ee76dba4528240f5ec1c024283284c6"

RPROVIDES:${PN} += "libwrc-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libexe.so.1 \
libfwnt.so.1 \
libwrc.so.1"

inherit rpm
