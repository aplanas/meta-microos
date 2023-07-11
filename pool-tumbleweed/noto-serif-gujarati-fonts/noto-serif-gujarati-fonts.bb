SUMMARY = "Noto Gujarati Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gujarati Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-gujarati-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "169ec7f4e54f736c7732df8b9dddb7221d9d74d6298e5e6763345b84a61dc029c764624da1e5ca822563017a5a1c94c59682ff51df07759f0ed07e88d9f0dce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-gujarati \
noto-serif-gujarati-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
