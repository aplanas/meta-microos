SUMMARY = "Adapta gedit themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains gedit themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gedit-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "e56ca56365bbbdb7fe99b72735c3cd9d9b734d930f07f482850319c12e553640093b8b00bba77cd53451c1740171173c58bc8b1e942aa4dc2b452a8ec0ddb7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gedit-theme-adapta"
RDEPENDS:${PN} += "gedit \
metatheme-adapta-common"

inherit rpm
