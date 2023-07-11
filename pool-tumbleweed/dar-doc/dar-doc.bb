SUMMARY = "Documentation for dar"
DESCRIPTION = "Documentation package for dar"
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.7.9"

RPM_NAME = "dar-doc-2.7.9-1.1.aarch64.rpm"
RPM_HASH = "f1e90c6372585fda030c8eae7c849cd99bcbb6214b1139a5a21bcee8f743747e362364902c8e39bb10b9f4ef90062000d00035dce5971f8fad00e86e8df15fa9"

RPROVIDES:${PN} += "dar-doc"

RDEPENDS:${PN} += ""

inherit rpm
