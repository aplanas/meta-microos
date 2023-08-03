SUMMARY = "YaST2 - Czech Translations"
DESCRIPTION = "YaST2 - Czech translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-cs-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "eda799e01bcb2aabd3150bec2ed13337d2d4dc5797ede274e23a6e852eeb4d55505164047ad76a2e2e8675b0adf156bb9c8e1f11226b532fd5c434efc66daa66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-cs \
yast2-trans-cs"

RDEPENDS:${PN} += ""

inherit rpm
