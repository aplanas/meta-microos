SUMMARY = "Adapta GTK+2 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GTK2+ themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gtk2-metatheme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "c7fedc3124434f1badde958f0bc11e93893217c5043d746d49ce66b5229215b278e212cc5e72b693fddba3ee5f8a849e7b1d03e7c3e0530a30e4393b5b8c2da0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-adapta"

RDEPENDS:${PN} += "gtk2 \
gtk2-engine-murrine \
metatheme-adapta-common"

inherit rpm
