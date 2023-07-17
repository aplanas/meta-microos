SUMMARY = "Library to access the Windows Prefetch File (PF) format"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "LGPL-3.0-or-later"

PV = "20221027"

RPM_NAME = "libscca1-20221027-3.11.aarch64.rpm"
RPM_HASH = "cd3b4c76fd777870c32f5091f01f08994c6ad55afb9e0ccae28561fd788d40e62853dd76db6195b1654dda00834bb49bce305b1e5dab7ef572b4efbd3ccfe900"

RPROVIDES:${PN} += "libscca.so.1 \
libscca1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
