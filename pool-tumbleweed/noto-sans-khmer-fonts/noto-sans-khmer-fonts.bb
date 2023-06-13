SUMMARY = "Noto Khmer Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khmer Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-khmer-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "9479e41069f76151d8dba210e9449f1863384035d9931c0fc3f9780738441e40278694153d0cffc349d37191be4fd83d676d3ede9c0750a9646a6bcca269eaea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-khmer \
noto-sans-khmer-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
