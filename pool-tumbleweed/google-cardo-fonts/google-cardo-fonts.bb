SUMMARY = "Serif Font for Classicists, Biblical Scholars, Medievalists, and Linguists"
DESCRIPTION = "Cardo is a large Unicode font specifically designed for the needs \
of classicists, Biblical scholars, medievalists, and linguists. \
It also works well for general typesetting in situations where a \
high-quality Old Style font is appropriate. Its large character \
set supports many modern languages as well as those needed by \
scholars. Cardo also contains features that are required for \
high-quality typography such as ligatures, text figures (also \
known as old style numerals), true small capitals and a variety \
of punctuation and space characters. \
 \
Designer: David Perry"
LICENSE = "OFL-1.1"

PV = "1.04"

RPM_NAME = "google-cardo-fonts-1.04-7.17.noarch.rpm"
RPM_HASH = "f75c1c87bfad779ea37e4770f8a50271c7250102e324c0bc48a440f2967319265ad948bcec222e1813703aaa8f0ad2a49eb85ef7ecb7cf72a8c3f30caf0a2451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-cardo-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
