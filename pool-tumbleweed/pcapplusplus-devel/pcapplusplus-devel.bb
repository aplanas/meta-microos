SUMMARY = "C++ network sniffing and packet parsing and crafting framework"
DESCRIPTION = "PcapPlusPlus is a C++ network sniffing and packet parsing and \
manipulation framework."
LICENSE = "Unlicense"

PV = "22.11"

RPM_NAME = "pcapplusplus-devel-22.11-1.4.aarch64.rpm"
RPM_HASH = "757d005eda34b0fd614dbe028ebc77b71a2b560ed87f5e90c535e9a476157a91df6cf2d13bed0599c7665719c0aa2b0e23fabbdcc8011ed962c10e6fb8ec2464"

RPROVIDES:${PN} += "pcapplusplus-devel \
pkgconfig-PcapPlusPlus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpcap-devel"

inherit rpm
