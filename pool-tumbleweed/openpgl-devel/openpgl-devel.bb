SUMMARY = "Development files for the Open Path Guiding library"
DESCRIPTION = "Development files for the Open Path Guiding library."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "openpgl-devel-0.4.1-1.4.aarch64.rpm"
RPM_HASH = "0e050662b20f1114ba6c4bf596f16eb9fb1d679fc64b6a3f31372ab9d8e382b8867a7e94ed2cf5ce2fe1a274f00590dbfd4b55fa451834ce1786e3c5d9c1b130"

RPROVIDES:${PN} += "cmake-openpgl \
openpgl-devel"

RDEPENDS:${PN} += "libopenpgl0"

inherit rpm
