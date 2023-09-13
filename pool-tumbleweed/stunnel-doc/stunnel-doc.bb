SUMMARY = "Documentation for the universal TLS Tunnel"
DESCRIPTION = "This package contains additional documentation for the stunnel program."
LICENSE = "GPL-2.0-or-later"

PV = "5.70"

RPM_NAME = "stunnel-doc-5.70-2.1.noarch.rpm"
RPM_HASH = "f4c45df0fd6705a098c991a00ca278b0c218236b3a41eb34e901031fb0a9692094e9e30ff4f6c51cda80dbdb24889bb7cc18c50e8eac0f855d553337f5f32798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stunnel-doc"

RDEPENDS:${PN} += "stunnel"

inherit rpm
