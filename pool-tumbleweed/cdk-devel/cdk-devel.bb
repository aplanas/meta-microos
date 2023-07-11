SUMMARY = "Development Part of Curses Development Kit"
DESCRIPTION = "This package includes the development headers and static libraries for \
CDK, the Curses Development Kit."
LICENSE = "BSD-3-Clause"

PV = "5.0.20230201"

RPM_NAME = "cdk-devel-5.0.20230201-1.1.aarch64.rpm"
RPM_HASH = "42d02f73e64c842802024c893853c3cf525485cab1c72f1a38543b4a6226a923be64903cc2ccc88b01314fd9fe3a8e3fff559873c295fd5e696252e64e48309e"

RPROVIDES:${PN} += "cdk-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
libcdk6-3-4 \
ncurses-devel"

inherit rpm
