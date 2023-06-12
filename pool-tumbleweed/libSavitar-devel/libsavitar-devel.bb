SUMMARY = "Header files for libSavitar"
DESCRIPTION = "Development package for libSavitar."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libSavitar-devel-4.13.1-2.7.aarch64.rpm"
RPM_HASH = "a6fa6e1d7d0e8bf2d6118ee5ac4e0d6379b6d359f326fd53267d13ebf8a15c81fa1d29583d0f3c220890379d6fc6c4004e324f746f026640fc05536b20def977"

RPROVIDES:${PN} += "cmake(Savitar) \
libSavitar-devel \
libSavitar-devel(aarch-64)"
RDEPENDS:${PN} += "libSavitar0 \
python3-sip-devel"

inherit rpm
