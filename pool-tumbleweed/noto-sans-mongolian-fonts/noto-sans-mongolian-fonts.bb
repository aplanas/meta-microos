SUMMARY = "Noto Mongolian Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mongolian Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mongolian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6954e9a54ec6346ced606300ae41baf84ca1b04d02fb406a98bae61681376043dced1faa61e22f58614069008e4fcc7639225ce19b6a2f9f6381cb361f4bf718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mongolian \
noto-sans-mongolian-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
