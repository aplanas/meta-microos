SUMMARY = "Documentation for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains documentation for Octave."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-doc-8.2.0-1.2.noarch.rpm"
RPM_HASH = "5d662cb5e68a1f8215ad427f94a93110a4b9a183ed432bf833b8997f31d2de12bc300b093294a1209d1b5f055f84c36ab23fc389051e9a351fd868ad5dc23209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "octave-doc"

RDEPENDS:${PN} += ""

inherit rpm
