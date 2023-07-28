SUMMARY = "Documentation for Scribus"
DESCRIPTION = "This package provides the documentation for Scribus."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "scribus-doc-1.5.8-4.15.aarch64.rpm"
RPM_HASH = "c36e7284034a2ac29c4abbbeef8267e0e1667ad0e4d9d5a228cd9c422bfe6c27023a8b37685dd400407cac4f1061e60003d689f3e324ffe06b97d7761bce1441"

RPROVIDES:${PN} += "scribus-doc"

RDEPENDS:${PN} += ""

inherit rpm
