SUMMARY = "The system GNU Compiler documentation"
DESCRIPTION = "The system GNU Compiler documentation."
LICENSE = "GFDL-1.2-only"

PV = "13"

RPM_NAME = "gcc-info-13-1.5.aarch64.rpm"
RPM_HASH = "6174efc1dbf4d2afc35f841112f5d46e1a4776bbc436bf0d44a5f48dbb823239d25a5a75d4ec365271a4515b0aea65c133c9bbb6c487c57c9b4382bd85e298a9"

RPROVIDES:${PN} += "gcc-info"

RDEPENDS:${PN} += "/usr/bin/sh \
gcc13-info"

inherit rpm
