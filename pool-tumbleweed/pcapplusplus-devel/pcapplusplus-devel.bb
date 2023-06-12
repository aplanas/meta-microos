SUMMARY = "C++ network sniffing and packet parsing and crafting framework"
DESCRIPTION = "PcapPlusPlus is a C++ network sniffing and packet parsing and \
manipulation framework."
LICENSE = "Unlicense"

PV = "22.11"

RPM_NAME = "pcapplusplus-devel-22.11-1.3.aarch64.rpm"
RPM_HASH = "1e9166f81980f1a8124e526f35dcd10aa4afeb740800ada9017ae783f7357824df139a0885fab146a102e7ce8adb0bb501d1fa11f0368e4ff0b3f9b12a1792d4"

RPROVIDES:${PN} += "pcapplusplus-devel \
pcapplusplus-devel(aarch-64) \
pkgconfig(PcapPlusPlus)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcap-devel"

inherit rpm
