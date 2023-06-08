SUMMARY = "Bulgarian (български) Dictionary for Aspell"
DESCRIPTION = "A Bulgarian (български) dictionary for the aspell spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.1"

RPM_NAME = "aspell-bg-4.1-2.14.aarch64.rpm"
RPM_HASH = "69753db8b9bb2c578878b02c997e1ffd69b137e012d77cf194a65f7e53b53f7ae72cb73b62de9a40eddf2224e38491cdf521a87a8e4896a18d31f32aa0e0d9fd"

RPROVIDES:${PN} += "aspell-bg aspell-bg(aarch-64) locale(aspell:bg)"
RDEPENDS:${PN} += ""

inherit rpm
