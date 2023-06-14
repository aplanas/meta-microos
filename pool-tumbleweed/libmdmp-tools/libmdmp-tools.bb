SUMMARY = "Utilities for reading Windows Minidump files"
DESCRIPTION = "This subpackage contains the utility programs from libmdmp to \
read Windows Minidump files."
LICENSE = "LGPL-3.0-or-later"

PV = "20210420"

RPM_NAME = "libmdmp-tools-20210420-3.4.aarch64.rpm"
RPM_HASH = "f01740e5f2944f13f68a86a3d55f326fe3fb7bdef13827e1fcf500e91b60ce214f01ddb0ef022eb56d269c59a211358f35d933c03ef15870637e09ddf9f12f4b"

RPROVIDES:${PN} += "libmdmp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libmdmp.so.1"

inherit rpm
