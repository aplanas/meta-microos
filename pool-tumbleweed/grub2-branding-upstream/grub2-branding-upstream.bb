SUMMARY = "Upstream branding for GRUB2's graphical console"
DESCRIPTION = "Upstream branding for GRUB2's graphical console"
LICENSE = "GPL-3.0-or-later"

PV = "2.06"

RPM_NAME = "grub2-branding-upstream-2.06-53.3.aarch64.rpm"
RPM_HASH = "69622f3c70829632e993a0d91721fd18a02945ed58b690b4b1d99ba69b6b637cc38f935b86fce1816157ebbf0cd96d3918cc3719cf8a467194837978523af474"

RPROVIDES:${PN} += "grub2-branding-upstream"

RDEPENDS:${PN} += "grub2"

inherit rpm
