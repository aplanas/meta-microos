SUMMARY = "This package includes the source files for Orthanc"
DESCRIPTION = "This package includes the source files for Orthanc. Use it in conjunction with the -devel package"
LICENSE = "GPL-3.0-or-later"

PV = "1.12.1"

RPM_NAME = "orthanc-source-1.12.1-1.1.aarch64.rpm"
RPM_HASH = "7b485a7910b4f7b62ab05e868bfa0d12e6f9aadc0c1dad06069d9f54b50bfc6fd30c50798ea1ea8f367b5caca66c7ee50254250aa862e72fc10c3af102640164"

RPROVIDES:${PN} += "orthanc-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
