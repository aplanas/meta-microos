SUMMARY = "Simple command-line utility for extracting text from EPUB documents"
DESCRIPTION = "Simple command-line utility for extracting text from EPUB documents"
LICENSE = "GPL-3.0-only"

PV = "2.06"

RPM_NAME = "epub2txt2-2.06-1.3.aarch64.rpm"
RPM_HASH = "391abc67dd8609d4ddaca6e4fbd84e8149e631db2f2a1bb8008d75fa86c735feed1bf2f8ce2d73c80687359b0755c3226452f9a0ec4a1b791791736dcf479a80"

RPROVIDES:${PN} += "epub2txt2 \
epub2txt2(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
unzip"

inherit rpm
