SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnsfdb to \
read Notes Storage Facility databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb-tools-20210419-3.8.aarch64.rpm"
RPM_HASH = "c5d267060b79c326bc49c679d5793cfb8dccb2c2a5c2ff50e3de5632f274f93ff8d74db2a2238aaa349b3e8903643614832f3625977ec1a77da2f441deef6e32"

RPROVIDES:${PN} += "libnsfdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libnsfdb.so.1"

inherit rpm
