SUMMARY = "Noto Mro Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Mro Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mro-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1b84766d8e2bda6281a035b25eb8830eacfd07fd43766e2e0016a56dc6fbf8a532596f28d9a284ed6840f72b94adfade69240d67a271962437239eb5b17db295"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mro \
noto-sans-mro-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
