SUMMARY = "Development files for the File Comparator"
DESCRIPTION = "Development files for the File Comparator package"
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.3"

RPM_NAME = "kompare-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "38c3835c0d5528ecf9e4a4f64e971b83e645b697844c2a18a29ed7375140888510650349490eba55ee7fde2718a74f8d7958a23530a8b94039ace2adf4edcc6c"

RPROVIDES:${PN} += "kompare-devel"

RDEPENDS:${PN} += "kompare"

inherit rpm
