SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnk2 to \
read Outlook Nickfile files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221122"

RPM_NAME = "libnk2-tools-20221122-3.3.aarch64.rpm"
RPM_HASH = "bd5378195388803bc7e9e268f8d207d6ce9b57c5262c66f44e23f7fd38d8f2632043d347da731388b231ac72a8e220b88e0d1c8a4cde6522e72941604accd43a"

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
