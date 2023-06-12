SUMMARY = "Development files for libRaTools"
DESCRIPTION = "The tools-libra package provides common functionality required by \
the task-specific resource access layers of the wbem-smt tasks such as \
cmpi-dns and cmpi-samba. \
This package includes the header files and link libraries for dependent \
provider packages."
LICENSE = "EPL-1.0"

PV = "1.0"

RPM_NAME = "sblim-tools-libra-devel-1.0-20.10.aarch64.rpm"
RPM_HASH = "e0ff2c1c2dc5d41a9282725525ec38a18a32d6efad629b7d23a9ef56bb12d78fc68c9f43ff6181935f61d054b58b6e4fa672f7681d7648e3e997049e466841d1"

RPROVIDES:${PN} += "libRaTools-devel \
sblim-tools-libra-devel \
sblim-tools-libra-devel(aarch-64)"
RDEPENDS:${PN} += "libRaTools0"

inherit rpm
