SUMMARY = "Hwloc GUI tool"
DESCRIPTION = "Hwloc GUI visualization tool - requires X11"
LICENSE = "BSD-3-Clause"

PV = "2.9.2"

RPM_NAME = "hwloc-gui-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "9887a3f63b179eafd211559657b7ae8ad37114921cf914ea9de90cb756feeb482a354ad02182ce3107c007c8501de00d4b45628656ff80ce4e8591febc397d6a"

RPROVIDES:${PN} += "hwloc-gui"

RDEPENDS:${PN} += "hwloc \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libhwloc.so.15 \
libm.so.6 \
libtinfo.so.6"

inherit rpm
