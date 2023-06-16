SUMMARY = "certmonger integration for cepces"
DESCRIPTION = "cepces is an application for enrolling certificates through CEP and CES. \
This package provides the certmonger integration."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.7"

RPM_NAME = "cepces-certmonger-0.3.7-1.3.noarch.rpm"
RPM_HASH = "6858c234b148669b4ec5cf78fff9040d30973b5938d6b28146b9e051b4a6110c808c804ffad71d29a1fc49fd63865a61a478655016a28310305914bd3922c075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cepces-certmonger"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
cepces \
certmonger"

inherit rpm
