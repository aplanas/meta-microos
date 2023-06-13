SUMMARY = "OpenSFX replacement sounds for OpenTTD"
DESCRIPTION = "OpenSFX replacement sounds for OpenTTD. The last required step \
to make OpenTTD independent."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & CDDL-1.1"

PV = "1.0.3"

RPM_NAME = "openttd-opensfx-1.0.3-1.6.noarch.rpm"
RPM_HASH = "3a20f26a47e33f6b8eb4ad2ee1629645d1c6d81673b056cdec204691ec6e5740aa2cd253b5ca56972445c1b5b8997fab13427435e33ec5fddcf76ff7ac8a28f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensfx \
openttd-opensfx"

RDEPENDS:${PN} += "openttd-data"

inherit rpm
