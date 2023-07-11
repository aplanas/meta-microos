SUMMARY = "Utilities for reading Windows Minidump files"
DESCRIPTION = "This subpackage contains the utility programs from libmdmp to \
read Windows Minidump files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp-tools-20210420-3.5.aarch64.rpm"
RPM_HASH = "91e0c5f9b1b2c49d35575c459c08c8aeb2d8a3a7c7f338f93e121efd37acb357cfea6c2eb8c95c2d93937d8470f3fbcb43138dc35b5144a41827bc0fdb1c9079"

RPROVIDES:${PN} += "libmdmp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libmdmp.so.1"

inherit rpm
