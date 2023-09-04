SUMMARY = "A program for local e-mail delivery"
DESCRIPTION = "Sendmail calls procmail to deliver email into a local folder. Procmail \
can be configured to store e-mail in different folders."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "3.24"

RPM_NAME = "procmail-3.24-1.1.aarch64.rpm"
RPM_HASH = "8fd4e7de40bac850d0291065e37aaceae09049bca090567b0b4785a148a6ef8fb50f09d63e501c3f9270a142fb0a91a638ce251684f330248d76a9a9af46e9d0"

RPROVIDES:${PN} += "procmail"

RDEPENDS:${PN} += "/usr/bin/sed \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
