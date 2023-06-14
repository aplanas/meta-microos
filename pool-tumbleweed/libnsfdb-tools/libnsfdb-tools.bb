SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnsfdb to \
read Notes Storage Facility databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb-tools-20210419-3.5.aarch64.rpm"
RPM_HASH = "68c00d112b5372099323bf055e2ce339e26b650d053e7b896de7f4167da3364a894542877b9c95662be5c1d2c82b3934503d68094709bf99e60eaf0b2335b422"

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
