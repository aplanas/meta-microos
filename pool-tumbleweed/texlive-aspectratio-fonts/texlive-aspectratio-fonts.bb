SUMMARY = "Severed fonts for texlive-aspectratio"
DESCRIPTION = "The  separated fonts package for texlive-aspectratio"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn25243"

RPM_NAME = "texlive-aspectratio-fonts-2023.201.2.0svn25243-53.1.noarch.rpm"
RPM_HASH = "6dce2cdf44c59e9e8a878c0f34cfdd7d87b2ff860922a75695c7f14e7141360f212a5234147973dd9d112d09e3c19edefa9516b3fc19d87a28c11ed799686661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(amar) \
font(ar10) \
font(ar12) \
font(ar5) \
font(ar6) \
font(ar7) \
font(ar8) \
font(ar9) \
font(arb10) \
font(arb12) \
font(arb5) \
font(arb6) \
font(arb7) \
font(arb8) \
font(arb9) \
font(arssbi10) \
font(arssi10) \
font(artti10) \
texlive-aspectratio-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
