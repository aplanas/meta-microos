SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-container-disk-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "cbbed0fcfea0c998868e0719643fd32e3a2383cec3a70e5f8ec5d6ab9765de83cea08e9242334cbab3170f1954ad5018e13d7565670c2e4aa2d47350816b6e8f"

RPROVIDES:${PN} += "kubevirt-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
