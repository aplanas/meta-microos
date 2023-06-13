SUMMARY = "YaST2 - Hebrew Translations"
DESCRIPTION = "YaST2 - Translations for Hebrew."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230516.e4ba802a"

RPM_NAME = "yast2-trans-he-84.87.20230516.e4ba802a-1.1.noarch.rpm"
RPM_HASH = "39b2aaa5e9e2d299574b405702815fad7bb75dc17f7739d9428f74c9b43ff358ee80f88d21b5ced2eaf2dd5cec189cff9bd5532397ec50269bb3634d1f4f3498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:he) \
yast2-trans-he"

RDEPENDS:${PN} += ""

inherit rpm
