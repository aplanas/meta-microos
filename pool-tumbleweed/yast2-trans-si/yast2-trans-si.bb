SUMMARY = "YaST2 - Sinhala Translations"
DESCRIPTION = "YaST2 - Translations for Sinhala."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230901.be24cb382f"

RPM_NAME = "yast2-trans-si-84.87.20230901.be24cb382f-1.1.noarch.rpm"
RPM_HASH = "c55162004130ca112906aca4f4108a478894fe7879b6be6b2e2936ab4a0353968ae2cbfea2859564ae2324dcf9bc8367a8c2338d216a6a7d70bb6976d595d34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-si \
yast2-trans-si"

RDEPENDS:${PN} += ""

inherit rpm
