SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230818.ea489402e5"

RPM_NAME = "yast2-trans-uk-84.87.20230818.ea489402e5-1.1.noarch.rpm"
RPM_HASH = "30d4fa7e5b497b286a2b53310cdb98bebb03265aae0fecda93f766a924f4543847e0596366fef2faa5e8d6d1beca93d48e91c198d55973bd183d2f08d1826a0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
