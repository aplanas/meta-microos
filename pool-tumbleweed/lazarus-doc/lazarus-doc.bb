SUMMARY = "Lazarus IDE documentation"
DESCRIPTION = "Lazarus is a cross-platform IDE and component library for Free Pascal. \
This package contains documentation and example programs for the Lazarus IDE."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.6"

RPM_NAME = "lazarus-doc-2.2.6-2.1.aarch64.rpm"
RPM_HASH = "b754437d76858a6f3c25d2b51b7a6bd2177f3c258885ad0e7ad65fcf6923ce10d2c721000e0887b0afa0041aba15127872a124ca3f304d450e73c7cbc8acf009"

RPROVIDES:${PN} += "lazarus-doc"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh"

inherit rpm
