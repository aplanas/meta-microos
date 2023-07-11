SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnk2 to \
read Outlook Nickfile files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-tools-20221122-3.5.aarch64.rpm"
RPM_HASH = "5a2fdbd393c441849b187f97a1929f18204cf8367557c4b84642900e46d9f9bb15f1fec018700cb6088d2d36c9026192416f9688f65a61b2e26a8c7990afcdb3"

RPROVIDES:${PN} += "libnk2-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfvalue.so.1 \
libnk2.so.1"

inherit rpm
