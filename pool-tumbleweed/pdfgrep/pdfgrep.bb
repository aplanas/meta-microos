SUMMARY = "Search in pdf files for strings matching a regular expression"
DESCRIPTION = "Pdfgrep is a tool to search text in PDF files. It works similar to `grep'. \
 \
Features: \
- search for regular expressions. \
- support for some important grep options, including: \
+ filename output. \
+ page number output. \
+ optional case insensitivity. \
+ count occurrences."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "pdfgrep-2.1.2-2.9.aarch64.rpm"
RPM_HASH = "4563495410bed75a51350a3431c00480a13549985d96e80bd8908f4bdf646ae7974b102978d7eef4470650b2258325dd0632cc3589016d7ad4c571317c924950"

RPROVIDES:${PN} += "pdfgrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libpcre.so.1 \
libpoppler-cpp.so.0 \
libstdc++.so.6"

inherit rpm
