SUMMARY = "Noto Arimo Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Arimo font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-arimo-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6ec112277c1a66ea25fab63e8c85bb9d9df75ca7479819b00798e422e022fd650a66d2bfc167f2526bd150960801d3cc7ae3839d506adc0a9ffcb6331b89bdca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-arimo-fonts \
noto-arimo \
noto-arimo-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
