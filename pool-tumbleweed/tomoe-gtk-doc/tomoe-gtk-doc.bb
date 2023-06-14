SUMMARY = "TOMOE GTK+ library"
DESCRIPTION = "TOMOE GTK+ library"
LICENSE = "LGPL-2.1+"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-doc-0.6.0-44.24.aarch64.rpm"
RPM_HASH = "adcaed5fd8379f95f37e907d4bfdb8f72f5bc041d5d213d44b6489c31a83b94b9ffe25f9f6ccf008bf0a98e825a650ea532bbe7bd06fbc5fe653cdc44054ec83"

RPROVIDES:${PN} += "tomoe-gtk-doc"

RDEPENDS:${PN} += "tomoe-gtk"

inherit rpm
