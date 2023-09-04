SUMMARY = "JIS X 0212 (aka JIS 2000) Encodings"
DESCRIPTION = "This module implements encodings that covers JIS X 0213 charset (AKA \
JIS 2000, hence the module name)."
LICENSE = "Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Encode-JIS2K-0.03-1.25.aarch64.rpm"
RPM_HASH = "c46068c6bce8f603667cefba6a6041e62ca6efc0413934f02d138d886fc8b3b2cbf76506b9e71702e8657d3ca74dcbef4742599a21e09e1fec87e9d4fb2f98dc"

RPROVIDES:${PN} += "perl-Encode--JIS2K \
perl-Encode--JIS2K--2022JP3 \
perl-Encode-JIS2K"

RDEPENDS:${PN} += "/usr/bin/enc2xs \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
