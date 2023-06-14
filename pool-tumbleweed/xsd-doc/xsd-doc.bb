SUMMARY = "API documentation files for xsd"
DESCRIPTION = "This package contains API documentation for xsd."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "4.1.0"

RPM_NAME = "xsd-doc-4.1.0-1.13.aarch64.rpm"
RPM_HASH = "631eea3c34e4e7ad4f4ee41fa2ee94a07e001bc52eba67a515f0bc754a51f1248ab12e81645cd28e797d640872c83ff38d4808dcf83fe4e836a8b009d199f9fe"

RPROVIDES:${PN} += "xsd-doc"

RDEPENDS:${PN} += "xsd"

inherit rpm
