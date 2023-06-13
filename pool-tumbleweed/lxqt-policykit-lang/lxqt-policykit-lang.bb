SUMMARY = "Translations for package lxqt-policykit"
DESCRIPTION = "Provides translations for the 'lxqt-policykit' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "lxqt-policykit-lang-1.2.0-1.2.noarch.rpm"
RPM_HASH = "14f156d34075a633375bcdc9c50279ccbccf4052a230be5f37481b3f4816f826140845be5af87a9baad9e17abe422d40a1ebd31cd5f6e0e406b846d56f7e5200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-policykit-lang \
lxqt-policykit-lang-all"

RDEPENDS:${PN} += "lxqt-policykit"

inherit rpm
