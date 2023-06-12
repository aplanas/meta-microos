SUMMARY = "Adapta Cinnamon themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the cinnamon themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "cinnamon-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "ef7cb5c077e2f84ac3514cd60aab9013d94f1de456c45a3447f84b64be2c879a3b2201e6b3850cec0035a9d3b1738b90605767c48ad26a761976ed453e2ce0f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-adapta"
RDEPENDS:${PN} += "cinnamon \
metatheme-adapta-common"

inherit rpm
