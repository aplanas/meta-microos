SUMMARY = "Development files for the File Comparator"
DESCRIPTION = "Development files for the File Comparator package"
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kompare-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a531c66dbf64335bd10df3706a3c083079aed240c44aa05b1647010fd9cbcb9d1e33083dcf7430d35f85bbfca613afe8c467b32d963ffb73f4aadd15db70e0af"

RPROVIDES:${PN} += "kompare-devel"

RDEPENDS:${PN} += "kompare"

inherit rpm
