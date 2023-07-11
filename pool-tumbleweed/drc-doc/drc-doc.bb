SUMMARY = "Documentation files for drc"
DESCRIPTION = "This package contains documentation for drc and Octave scripts to generate \
comparison graphs."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.3"

RPM_NAME = "drc-doc-3.2.3-1.15.aarch64.rpm"
RPM_HASH = "86974b2cf89d219993c4de81820491550005747661a545084ba53f0cd227adb1a6f51f994306b92618b0dc4b6d827e6d82ad2d0890df1870d082eef50c1fbe1d"

RPROVIDES:${PN} += "drc-doc"

RDEPENDS:${PN} += ""

inherit rpm
