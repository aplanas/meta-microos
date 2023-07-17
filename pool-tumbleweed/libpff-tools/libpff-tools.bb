SUMMARY = "Tools to access Microsoft PST and OST files"
DESCRIPTION = "Tools to access the Personal Folder File (PFF) and the Offline Folder \
File (OFF) format. These are used in several file types: PAB \
(Personal Address Book), PST (Personal Storage Table) and OST \
(Offline Storage Table)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230325"

RPM_NAME = "libpff-tools-20230325-1.8.aarch64.rpm"
RPM_HASH = "7629242b18c0b2ecb2e85a2952bd2b80520f733651afea18f650562de449fc16fa10913cfd0376848fd88d789280819198ab17ef8684eca0677b7c4699eea01e"

RPROVIDES:${PN} += "libpff-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfmapi.so.1 \
libfvalue.so.1 \
libpff.so.1 \
libpff1"

inherit rpm
