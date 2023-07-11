SUMMARY = "Noto Elbasan Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Elbasan Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-elbasan-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a9e12a0851fb2d11d21e97a48df822139b9cc944a5b85777a7a29ebc9810eab9f0f8c85cc3b8251548464c70af6c3ecc7ae23360ef42e3e9f415e31db0bb81aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-elbasan \
noto-sans-elbasan-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
