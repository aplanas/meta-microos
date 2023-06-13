SUMMARY = "Binary files of texcount"
DESCRIPTION = "Binary files of texcount"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13013"

RPM_NAME = "texlive-texcount-bin-2023.20230311.svn13013-91.1.aarch64.rpm"
RPM_HASH = "3714173dcdf96e999b7d21c7f7352a85ab87938e4d5c4b502eeb3b0da3f2685b0b94c0d161095e65074475d5cfe677e46d4ba2ade3fc71b95ac265e1bd8027f2"

RPROVIDES:${PN} += "texlive-texcount-bin \
texlive-texcount-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-texcount"

inherit rpm
