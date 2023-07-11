SUMMARY = "A program for local e-mail delivery"
DESCRIPTION = "Sendmail calls procmail to deliver email into a local folder. Procmail \
can be configured to store e-mail in different folders."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "3.22"

RPM_NAME = "procmail-3.22-277.9.aarch64.rpm"
RPM_HASH = "d9146bbfe2db84181f17f2d52cfd33ca6dba55404bcb82c0ce67f84be671d62b144eae153ba9fbdfa06447678c74520dabd5be3d57cf42ce36e6bedaae6e64f2"

RPROVIDES:${PN} += "procmail"

RDEPENDS:${PN} += "/usr/bin/sed \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
