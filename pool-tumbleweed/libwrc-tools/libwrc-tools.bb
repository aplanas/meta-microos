SUMMARY = "Utilities to inspect Windows Resource Compiler files"
DESCRIPTION = "This subpackage provides the utilities from libwrc, which allows for \
reading Windows Resource Compiler files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-tools-20230318-2.1.aarch64.rpm"
RPM_HASH = "5fee54be40e54ddaf1a267002444c2905d65bf78448c9f5c462d6d3174abf79ffca75f6c48f412811cd7139969e83a1641a0a9a32f2e0da35dc7b004f48714e7"

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
