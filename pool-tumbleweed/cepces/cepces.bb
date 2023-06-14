SUMMARY = "Certificate Enrollment through CEP/CES"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
It currently only operates through certmonger."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "cepces-0.3.7-1.3.noarch.rpm"
RPM_HASH = "a8c4b1041b182502cf366a1622cf5ba9b2889c3a3900239a5dbe725bf2d92a61e4db903e26fb311c1576c8e372d6d53ddeb82a667aec4d1bc6e7e1df64dced4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces \
config-cepces"

RDEPENDS:${PN} += "cepces-certmonger \
python3-cepces"

inherit rpm
