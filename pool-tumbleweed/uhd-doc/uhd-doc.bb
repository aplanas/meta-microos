SUMMARY = "Documentation files for uhd"
DESCRIPTION = "This package contains the documentation for the Universal Hardware Driver (UHD)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.0.0"

RPM_NAME = "uhd-doc-4.4.0.0-1.5.noarch.rpm"
RPM_HASH = "b9fbbb58ca1c1fdc468724f698aca6d46306e44ad55c7a70e10a2ef87718ab000d1b16128dc02ead0ae083f8e1e843904caf19a82b5d0c75a86beda73410e270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uhd-doc"

RDEPENDS:${PN} += ""

inherit rpm
