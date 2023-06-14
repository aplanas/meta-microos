SUMMARY = "Upstream branding"
DESCRIPTION = "This branding-style package sets default applications in LXDE in openSUSE. \
This is a dumb package, which provides only upstream LXDE configurations as preferred defaults. \
You most probably don't want this package. You probably want to install distribution default \
lxde-common-branding and prefer openSUSE default settings."
LICENSE = "GPL-2.0"

PV = "0.99.2"

RPM_NAME = "lxde-common-branding-upstream-0.99.2-2.17.noarch.rpm"
RPM_HASH = "1ae4e165ce242eb715111aca57857883ac33d4e3201efe02598ff7055ebc01d156066b8a1e23684926e386dbc55809776571ddddd9948df4e3c0472ec548bab4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxde-common-branding-upstream \
lxde-common-branding \
lxde-common-branding-upstream"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
