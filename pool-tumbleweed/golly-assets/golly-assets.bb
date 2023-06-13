SUMMARY = "Assets for golly"
DESCRIPTION = "This package contains assets for golly: Help, rules, patterns and scripts."
LICENSE = "GPL-2.0-or-later"

PV = "4.2"

RPM_NAME = "golly-assets-4.2-2.1.noarch.rpm"
RPM_HASH = "5bbf94b5c47dd061d74469663f5c0bdd71b318f144745be5416a4627f60c2d75f0334f510496f39cde3fc02c38851abaebb1492a253931453c73f06338eaec9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "golly-assets"

RDEPENDS:${PN} += ""

inherit rpm
