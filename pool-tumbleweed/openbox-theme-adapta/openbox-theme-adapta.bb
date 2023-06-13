SUMMARY = "Adapta openbox themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the openbox themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "openbox-theme-adapta-3.95.0.11-3.5.noarch.rpm"
RPM_HASH = "d170438e39dc1d1f611c39fb0589cd1ebd5209e6eeccd5fa643149d66b2a5ec57677bc8bd2a5b5c7dbb87c8fa62c1b2706bd6ded70b11c3785ca5c60837d650a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openbox-theme-adapta"

RDEPENDS:${PN} += "metatheme-adapta-common \
openbox"

inherit rpm
