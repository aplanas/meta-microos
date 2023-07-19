SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "kubevirt-container-disk-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "927f286eeb10ba7079cb6ee81e49fdf553db47446d3cc465fd7d912e9e26069f7a228ea5704c9dd5893878652eb46d276b056064ad9a9e539c442b5564d857f8"

RPROVIDES:${PN} += "kubevirt-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
