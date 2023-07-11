SUMMARY = "Files needed for stl-thumb development"
DESCRIPTION = "Files needed to develop applications for the stl-thumb."
LICENSE = "MIT"

PV = "0.5.0~0"

RPM_NAME = "stl-thumb-devel-0.5.0~0-3.2.aarch64.rpm"
RPM_HASH = "651afd06d722b0361ad5b2b39cd0de9a17b6691e8938b645e34bb5942156181d27ed630f9b1885e3def5dac91e0840549e5ee7920ec1e4b4d415125c68cbc2bb"

RPROVIDES:${PN} += "stl-thumb-devel"

RDEPENDS:${PN} += "libstl-thumb"

inherit rpm
