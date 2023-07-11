SUMMARY = "Utilities for reading Outlook Nickfile files"
DESCRIPTION = "This subpackage contains the utility programs from libnsfdb to \
read Notes Storage Facility databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20210419"

RPM_NAME = "libnsfdb-tools-20210419-3.7.aarch64.rpm"
RPM_HASH = "ae725086dfde31d0df270831736422802b29ec5df6f9fc58bf399c80853bccd08964ae982f4511ce80c897ee288cad4596ff1c46db37697cce4249a0e2e0db71"

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
