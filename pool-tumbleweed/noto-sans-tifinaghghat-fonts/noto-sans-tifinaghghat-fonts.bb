SUMMARY = "Noto Tifinagh Ghat Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghGhat Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghghat-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ef83747116bdfacfa1099a8a795a6d7c7e6cb7ad20f41ffe6ba0e593b007bcd4679eeb2ed4e890680eae831029efaad6abf62a03cbf9d42872677faf7d11a501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghghat \
noto-sans-tifinaghghat-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
