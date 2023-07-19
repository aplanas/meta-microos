SUMMARY = "Binary files of afm2pl"
DESCRIPTION = "Binary files of afm2pl"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65877"

RPM_NAME = "texlive-afm2pl-bin-2023.20230311.svn65877-93.1.aarch64.rpm"
RPM_HASH = "d98b4c50e270301728d4f6dd2e231bddecfecce27f36056a6ab913f33c49cd8c97ca038507af6e800b1622d6c77e459a01b352e0d62675df73af469900cb01b7"

RPROVIDES:${PN} += "texlive-afm2pl-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
libm.so.6 \
texlive-afm2pl"

inherit rpm
