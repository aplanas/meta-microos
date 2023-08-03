SUMMARY = "YaST2 - Simplified Chinese Translations"
DESCRIPTION = "YaST2 - Simplified Chinese translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230729.64eca7e0a1"

RPM_NAME = "yast2-trans-zh_CN-84.87.20230729.64eca7e0a1-1.1.noarch.rpm"
RPM_HASH = "df45fbce434fa420d8d87268b5656939926e6b424034684c875ac6282b73a5f70b484afb9f2e142f76c0477f3f32541ee7bdf41a58f7d0b25bc7c3622c34c4c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-CN \
yast2-trans-zh-CN"

RDEPENDS:${PN} += ""

inherit rpm
