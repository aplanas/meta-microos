SUMMARY = "Config schema for GDM"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-schema-44.1-3.1.noarch.rpm"
RPM_HASH = "cf3063dc51d25634a94abfd8249568ba6fac1e45cff5594541b0e950d64195159b988c8ea1886b6d3fa16efdd2936a95f7915a4e40b20c3ad3973449db89155f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdm-schema"

RDEPENDS:${PN} += ""

inherit rpm
