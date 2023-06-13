SUMMARY = "A program for local e-mail delivery"
DESCRIPTION = "Sendmail calls procmail to deliver email into a local folder. Procmail \
can be configured to store e-mail in different folders."
LICENSE = "Artistic-1.0 | GPL-2.0-or-later"

PV = "3.22"

RPM_NAME = "procmail-3.22-277.8.aarch64.rpm"
RPM_HASH = "b22c23270d97e387c844cd2d1775b368d0fdc04bf02270ff8d28136d1f10399355e9649e4c29e0c0890950bd5cf0b5a85f53521d5a7c16ddd4a4b7ebf59911bd"

RPROVIDES:${PN} += "procmail \
procmail(aarch-64)"

RDEPENDS:${PN} += "/bin/sed \
/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
