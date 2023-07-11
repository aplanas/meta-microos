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

RPM_NAME = "pdfgrep-2.1.2-2.10.aarch64.rpm"
RPM_HASH = "1c10a9ebbfae447a0098d2885a6ba1a5edf998b4f05afdcce52967a51f343841ab5bd86c4f9b747f13ecaf22d4531d90963a8c269f1b0cb6eb0c620bbc3ef7d4"

RPROVIDES:${PN} += "pdfgrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libpcre.so.1 \
libpoppler-cpp.so.0 \
libstdc++.so.6"

inherit rpm
