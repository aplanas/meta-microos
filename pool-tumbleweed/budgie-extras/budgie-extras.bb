SUMMARY = "Additional Budgie Desktop enhancements for user experience"
DESCRIPTION = "Additional Budgie Desktop enhancements for the user experience"
LICENSE = "GPL-3.0-or-later"

PV = "1.6.0"

RPM_NAME = "budgie-extras-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "660adff9ebf5d0608ea2bcccac0d7638ca05aea10510382a108df8fbf6632421d2cf629e898b0a7fe075b26d1fbd15aca5fb925eb0a6832cf9335bb63196c96e"

RPROVIDES:${PN} += "budgie-extras"

RDEPENDS:${PN} += ""

inherit rpm
