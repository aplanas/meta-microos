SUMMARY = "Firmware files for Adaptec SAS Cards (AIC94xx Series)"
DESCRIPTION = "Firmware files for the Adaptec AIC94xx (Razor) Series of SAS HBA \
Adapters."
LICENSE = "SUSE-Firmware"

PV = "1.35"

RPM_NAME = "adaptec-firmware-1.35-26.7.noarch.rpm"
RPM_HASH = "28bbd60105507e3744b37c263cecf9bac2e75da6db27f3943c9277450cad4f4e110afb5d708920db515e11827f4ba7896f73cf73b25edd88737cf9ec49354057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adaptec-firmware \
firmware(aic94xx-seq.fw)"

RDEPENDS:${PN} += ""

inherit rpm
