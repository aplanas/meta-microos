SUMMARY = "Utilities to inspect Windows Resource Compiler files"
DESCRIPTION = "This subpackage provides the utilities from libwrc, which allows for \
reading Windows Resource Compiler files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-tools-20230318-1.5.aarch64.rpm"
RPM_HASH = "56469a3a189edc98b4faabea4335887b95adddb7e0c28010c57ea987d6bc0d778fa6f4b710e0090118144beb8e61149878091559669f4a386a243238eea973fa"

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
