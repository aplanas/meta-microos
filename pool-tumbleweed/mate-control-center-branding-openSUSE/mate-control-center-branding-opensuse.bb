SUMMARY = "openSUSE Branding of mate-control-center"
DESCRIPTION = "This package provides the openSUSE definition of what appears in the \
control centre."
LICENSE = "GPL-2.0+"

PV = "42.1"

RPM_NAME = "mate-control-center-branding-openSUSE-42.1-5.5.noarch.rpm"
RPM_HASH = "2320690653a7a525cca7277f657ecc20e37356fb2b40bd723604bc3697151c484d70d6e8813d2e2f23869c79ee1d4ce3dcf07ad2733cef7b67a1bb2662a8fcf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(mate-control-center-branding-openSUSE) \
mate-control-center-branding \
mate-control-center-branding-openSUSE"

RDEPENDS:${PN} += "mate-control-center"

inherit rpm
