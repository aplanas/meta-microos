SUMMARY = "Noto Phoenician Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Phoenician Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-phoenician-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "aae6c38a2fbfc4ce332574f6f71464104a3803ee58251786b39e3e0cd96599f85850b8486396f2977b95fc029570eb1f167a16939a0bcb894b81b14b11343fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-phoenician \
noto-sans-phoenician-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
