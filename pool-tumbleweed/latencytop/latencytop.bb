SUMMARY = "Kernel latency measuring tool"
DESCRIPTION = "LatencyTOP is a Linux* tool for software developers (both kernel and \
userspace), aimed at identifying where in the system latency is \
happening, and what kind of operation/action is causing the latency to \
happen so that the code can be changed to avoid the worst latency \
hiccups. A version with graphic interface is available as xlatencytop."
LICENSE = "GPL-2.0"

PV = "0.5"

RPM_NAME = "latencytop-0.5-25.24.aarch64.rpm"
RPM_HASH = "b4ad7826d4597758f38e3789d5b4e806022270e105c2f87bf9ebae1335fd39c3af3516522a439753f22101b7b8293bbaf168c2e5b7722b1a546a22fbdfd3193f"

RPROVIDES:${PN} += "latencytop \
latencytop(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit)"

inherit rpm
