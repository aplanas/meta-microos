SUMMARY = "Microsoft Azure CLI 2.0"
DESCRIPTION = "Microsoft Azure CLI 2.0 Command Line Utilities"
LICENSE = "MIT"

PV = "2.50.0"

RPM_NAME = "azure-cli-test-2.50.0-1.1.aarch64.rpm"
RPM_HASH = "81aa585e567ddff5c8a00b105330536f386ae4e3832941c80c888f469a44bb23611dcbaaea7e4b3a0a7f674056115a8bd27d628fd4d9e3f3875673261abf547c"

RPROVIDES:${PN} += "azure-cli-test"

RDEPENDS:${PN} += ""

inherit rpm
