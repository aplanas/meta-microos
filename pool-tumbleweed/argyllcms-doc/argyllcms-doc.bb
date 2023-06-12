SUMMARY = "Argyll CMS documentation"
DESCRIPTION = "The Argyll color management system supports accurate ICC profile creation for \
scanners, CMYK printers, film recorders and calibration and profiling of \
displays. \
 \
This package contains the Argyll color management system documentation."
LICENSE = "AGPL-3.0-only & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "argyllcms-doc-2.3.1-2.5.aarch64.rpm"
RPM_HASH = "49c0d91714d22da83f17bce49fb6420583e5f0b061040db23ce836e712db459b273094af8df26af2163ffb3c91a1345d08d130a35a0229119218ce2114cf7fde"

RPROVIDES:${PN} += "argyllcms-doc \
argyllcms-doc(aarch-64)"
RDEPENDS:${PN} += "argyllcms"

inherit rpm
