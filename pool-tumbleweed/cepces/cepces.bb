SUMMARY = "Certificate Enrollment through CEP/CES"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
It currently only operates through certmonger."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "cepces-0.3.7-1.4.noarch.rpm"
RPM_HASH = "9ef162b597e9970b625f37b066fbc04ced17f59bb476da5a4cefb9e16de24d3da9d218d45e2767ed09c0b2d18c1594702b4d854fc4b004992f0c0a2b3ed9580a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces \
config-cepces"

RDEPENDS:${PN} += "cepces-certmonger \
python3-cepces"

inherit rpm
