SUMMARY = "Utilities to inspect Windows Resource Compiler files"
DESCRIPTION = "This subpackage provides the utilities from libwrc, which allows for \
reading Windows Resource Compiler files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-tools-20230318-1.4.aarch64.rpm"
RPM_HASH = "915cf79b24ad683215043541195a269f8b77b3d5c3a6f2b516474af63ec89cf60cd7513e120742868d1eb2e190eecce240c0d732812bcba7e28c2b19455c4364"

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
