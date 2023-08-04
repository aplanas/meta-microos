SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20230802"

RPM_NAME = "openSUSE-release-ftp-20230802-1758.1.aarch64.rpm"
RPM_HASH = "2cf49253ffc16ee5d2c332fb3adb725a27a8286ed98cb6856a2d868cdc32f2d1a0db54bc76112829d11833ec5f4f84d76ba572500b03b280a355812ae1d7edee"

RPROVIDES:${PN} += "flavor-ftp \
openSUSE-release-ftp \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
