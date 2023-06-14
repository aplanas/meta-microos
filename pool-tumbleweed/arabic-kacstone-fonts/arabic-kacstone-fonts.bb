SUMMARY = "Arabic Kacst One Fonts"
DESCRIPTION = "KacstOne family developed by Kacst institution."
LICENSE = "GPL-2.0-only"

PV = "5.0"

RPM_NAME = "arabic-kacstone-fonts-5.0-18.15.noarch.rpm"
RPM_HASH = "b364cb6b7c44009b86a1b5698ddeb42bccefbaea4d6e0c4362ef8c3706cf73e501af4e529862a00a1e1326ab062c53c46d697eb1f58acd6ada95482bf8cbc001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-kacstone-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
