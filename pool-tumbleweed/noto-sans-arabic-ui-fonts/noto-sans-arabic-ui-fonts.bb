SUMMARY = "Noto Arabic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Arabic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-arabic-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "8391f539c74b9f5458fd18d80b9ed465b8fdb9297e22d1c622ba9646971abc6bffb318c65763d33e4e8afe2b0e87acfca6b96615d4a47a5df4aeea27288849a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-arabic-ui \
noto-sans-arabic-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
