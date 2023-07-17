SUMMARY = "This package includes the source files for Orthanc"
DESCRIPTION = "This package includes the source files for Orthanc. Use it in conjunction with the -devel package"
LICENSE = "GPL-3.0-or-later"

PV = "1.12.1"

RPM_NAME = "orthanc-source-1.12.1-1.2.aarch64.rpm"
RPM_HASH = "915507d301022fb7c9855b5f303d483c3cda54c23e961c3b00f8831fe4fb9e6d30dbb89ec917ce82873643168a22b88932bbaaa353c518aac2f29a86a6fa839f"

RPROVIDES:${PN} += "orthanc-source"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
