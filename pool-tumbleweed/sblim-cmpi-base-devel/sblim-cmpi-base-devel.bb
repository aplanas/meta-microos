SUMMARY = "SBLIM Base Instrumentation Header Development Files"
DESCRIPTION = "SBLIM Base Provider Development Package"
LICENSE = "EPL-1.0"

PV = "1.6.4"

RPM_NAME = "sblim-cmpi-base-devel-1.6.4-7.15.aarch64.rpm"
RPM_HASH = "81600a3a51bb4b2801f95ea08d33d6b165c4c286ee27a8c924d99fb74878967464e26acfe25d57c64ce39c507c7c412233484b8f40d4d5f9beb760f976ca695d"

RPROVIDES:${PN} += "sblim-cmpi-base-devel \
sblim-cmpi-base-devel(aarch-64)"

RDEPENDS:${PN} += "sblim-cmpi-base"

inherit rpm
