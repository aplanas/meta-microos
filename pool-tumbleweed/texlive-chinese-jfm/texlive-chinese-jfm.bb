SUMMARY = "Luatexja-jfm files for Chinese typesetting"
DESCRIPTION = "ChineseJFM is a series of luatexja-jfm files for better Chinese \
typesetting, providing quanjiao, banjiao, and kaiming three \
styles and other fancy features. It can be used for both \
horizontal and vertical writing mode in Simplified/Traditional \
Chinese or Japanese fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57758"

RPM_NAME = "texlive-chinese-jfm-2023.201.1.1.1svn57758-53.1.noarch.rpm"
RPM_HASH = "afa96d0fb89ecf9dbcd2ad245a7533bdfa73236be9ecb277c6f1fcd1485d9e1408225084abed86f58dfa1296615ff8cf6b48079a9f96e9692809bfe9ffce493f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chinese-jfm"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
