SUMMARY = "Cockpit module for Agama"
DESCRIPTION = "Cockpit module for the experimental Agama installer."
LICENSE = "GPL-2.0-only"

PV = "2.1+0"

RPM_NAME = "cockpit-agama-2.1+0-1.1.noarch.rpm"
RPM_HASH = "a5a6cc6c79008f8f6c2f32e2bfe25826bd299a2c2034b4be5bc6296b7be175137949c800c7b28bba0a8b1a2d4c335228425a6ca0cd265a4d7df34eebcbe2c941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-agama"

RDEPENDS:${PN} += "cockpit"

inherit rpm
