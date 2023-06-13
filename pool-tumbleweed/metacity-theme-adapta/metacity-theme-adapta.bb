SUMMARY = "Adapta Metacity themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the metacity themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "metacity-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "8f72d4c01dc7af67db5758450cc8a17830aded2a575f2c6c0dead3023198149739786815d4da80d607e5cab8a0502e11e2b069dff0a748f21115f16964332193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metacity-theme-adapta"

RDEPENDS:${PN} += "metacity \
metatheme-adapta-common"

inherit rpm
