SUMMARY = "Convenience package providing os-autoinst+swtpm"
DESCRIPTION = "Convenience package providing os-autoinst and swtpm dependencies."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.1693332527.fb060dc"

RPM_NAME = "os-autoinst-swtpm-4.6.1693332527.fb060dc-1.1.aarch64.rpm"
RPM_HASH = "ceae3304e7b181eaec0c5d1550f79e9ed9ddd611083b9812ac5d4ada5748c46367d7ed6f11aa7cb5a2213e67a296264662270654c884bdd0e9c66d60c81a66be"

RPROVIDES:${PN} += "os-autoinst-swtpm"

RDEPENDS:${PN} += "os-autoinst \
swtpm"

inherit rpm
