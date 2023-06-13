SUMMARY = "Fallback Icon Theme"
DESCRIPTION = "This is the default fallback theme used by implementations of the icon \
theme specification."
LICENSE = "GPL-2.0-or-later"

PV = "0.17"

RPM_NAME = "hicolor-icon-theme-0.17-4.2.noarch.rpm"
RPM_HASH = "6bb13e74fae5e1d6ce664b311fb08ef4f561a01832e388aea0ef3f4984000381d4da439d7234e56a1fabc3a357371950eeebbd69c2887cb9d919431f3435012d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hicolor-icon-theme \
rpm_macro(icon_theme_cache_create_ghost) \
rpm_macro(icon_theme_cache_post) \
rpm_macro(icon_theme_cache_postun)"

RDEPENDS:${PN} += ""

inherit rpm
