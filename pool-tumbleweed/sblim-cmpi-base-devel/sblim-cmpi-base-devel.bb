SUMMARY = "SBLIM Base Instrumentation Header Development Files"
DESCRIPTION = "SBLIM Base Provider Development Package"
LICENSE = "EPL-1.0"

PV = "1.6.4"

RPM_NAME = "sblim-cmpi-base-devel-1.6.4-7.16.aarch64.rpm"
RPM_HASH = "18451c797115e1facf11a574e47fbf8f50bce0d064c44d55b2aabf361c4090fd8b032742ebcb311bd94eb1a7f24313fa73568abb4c31c6725d150f1d9c2b0885"

RPROVIDES:${PN} += "sblim-cmpi-base-devel"

RDEPENDS:${PN} += "sblim-cmpi-base"

inherit rpm
