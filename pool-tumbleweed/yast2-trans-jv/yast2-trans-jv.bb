SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-jv-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "bb26f2e196b4cd49f8d7af1b835ffab6d267cf4c07c6c8781160ed28030cc74b22d0e1d6ebca18d55ae2a1bf1850f224fd2611bfcd1fd92de4c232b2d7dda87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-jv \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm
