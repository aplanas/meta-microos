SUMMARY = "Adapta Plank themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the Plank themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "plank-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "16cb5a7a81e97ce929564420e50c6560814220273b60769e9bba6ab60a729af1898f68f2cb886673db18e65f39ca36f1ec5db79112bb632e19297e19e9bb370f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plank-theme-adapta"
RDEPENDS:${PN} += "metatheme-adapta-common \
plank"

inherit rpm
