SUMMARY = "Chinese TrueType Fonts (Contains Only the License Text)"
DESCRIPTION = "Chinese TrueType fonts by Arphic Technology. This package contains only \
the license texts. The fonts themselves are in the sub-packages \
arphic-bkai00mp-fonts, arphic-bsmi00lp-fonts, arphic-gkai00mp-fonts, and \
arphic-gbsn00lp-fonts."
LICENSE = "Arphic-1999"

PV = "20001125"

RPM_NAME = "arphic-fonts-20001125-778.2.noarch.rpm"
RPM_HASH = "1e7cbb9511abd2943fe90211781449401ab6e7f0f98748d2aff5c06d8a7149cb87b79f18611c4731d68649e2f32c549766d29a9cba0eae76be142f07d9e6ca80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arphic-fonts \
ttf-arphic"

RDEPENDS:${PN} += "aaa-base \
coreutils \
perl"

inherit rpm
