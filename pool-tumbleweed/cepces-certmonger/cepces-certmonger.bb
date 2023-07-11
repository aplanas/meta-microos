SUMMARY = "certmonger integration for cepces"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
This package provides the certmonger integration."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "cepces-certmonger-0.3.7-1.4.noarch.rpm"
RPM_HASH = "37e72d7e1791e3f981da3236fd3dde08633880e8ec37b85eea530be25b63d6cf4b0e45984463f26cde28e2c7acc1ca11ff0ba90691497226ffedd7284c56e7db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces-certmonger"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
cepces \
certmonger"

inherit rpm
