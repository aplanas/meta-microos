SUMMARY = "Documentation for qt6-declarative in QCH format"
DESCRIPTION = "This package contains documentation for qt6-declarative in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-declarative-docs-qch-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "df1e97cfba008cd5905f9aed706a76ae64aac3fd3e49fb3d7e4e459b6a1bcbd5262ea060f02da81d3ac4da8d5f09dfb2a0c0650c9d4fdae9c50f66bc0148d4f5"

RPROVIDES:${PN} += "qt6-declarative-docs-qch \
qt6-quickcontrols2-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
