SUMMARY = "Fully colorized df clone written in python"
DESCRIPTION = "pydf displays the amount of used and available space on your file systems, \
just like df, but in colors. The output format is completely customizable."
LICENSE = "SUSE-Public-Domain"

PV = "12"

RPM_NAME = "pydf-12-3.14.noarch.rpm"
RPM_HASH = "42931b0c5c51cd37647d3a526b7587ca9c08906a7bd044092da5b1caf9ddc612226f7649a534739f3ff49ae46ab1dde98aae533c25f9b8637897fbc9829661ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pydf \
pydf"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
