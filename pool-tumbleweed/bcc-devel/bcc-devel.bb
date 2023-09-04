SUMMARY = "Header files for the BPF Compiler Collection"
DESCRIPTION = "Headers and pkg-config build descriptions for developing BCC programs."
LICENSE = "Apache-2.0"

PV = "0.26.0"

RPM_NAME = "bcc-devel-0.26.0-2.12.aarch64.rpm"
RPM_HASH = "060d4feb5d56eb41fa4bac79b12910ebe62ac54c99012b71b092aabea7eba25a1ec39ce36e4c40fd89f3f15253b746069c302d001b05e1f49b8ead3e8f521efc"

RPROVIDES:${PN} += "bcc-devel \
pkgconfig-libbcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcc0"

inherit rpm
