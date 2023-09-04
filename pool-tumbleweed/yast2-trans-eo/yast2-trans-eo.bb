SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-eo-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "bd99799db81aec1b69e9aa80f0e3bbc7b57b751f949fa4c067bb670c3ffa8231cdd56bb0ec209da352d0f731f315c2863ebef043deeb08635f1c8187b18573d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eo \
yast2-trans-eo"

RDEPENDS:${PN} += ""

inherit rpm
