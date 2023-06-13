SUMMARY = "Multi-purpose multi-phase micro-benchmark"
DESCRIPTION = "Meabo is a multi-phased multi-purpose micro-benchmark. It is a highly \
configurable tool which can be used for energy efficiency studies, ARM \
big.LITTLE Linux scheduler analysis and DVFS studies. It can be used for \
other benchmarking as well. \
 \
The micro-benchmark is composed of 10 phases that perform various generic \
calculations (from memory to compute intensive). None of the compute \
kernels are optimized for a specific architecture. The micro-benchmark is \
easily extensible, provides performance counter readings (today) and energy \
readings (in the future), has multi-core and flexible pinning support, and \
allows the user to run each phase in different configurations/ \
 \
One of the main benefits of this tool is that it is scalable beyond the \
aforementioned investigations, and is useful for anyone who would like \
to understand system behaviour, whilst running small, simple and \
well-understood computational kernels. The level of flexibility built into \
the application is an added benefit, as it gives the user full control of \
what is being run, where it is run, and whether it's single or \
multi-threaded, all within the same run of the application."
LICENSE = "Apache-2.0"

PV = "1.0+git.20180412"

RPM_NAME = "meabo-1.0+git.20180412-2.11.aarch64.rpm"
RPM_HASH = "7eb799da97e135ceb6af979dc11fb979645b8ee968182f364d3dc25941439e43f6013a9f4676bacb7cc6cf074f09776b0aa8b19349cb387b400e75270125da90"

RPROVIDES:${PN} += "meabo \
meabo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgomp.so.1()(64bit) \
libgomp.so.1(GOMP_1.0)(64bit) \
libgomp.so.1(GOMP_4.0)(64bit) \
libgomp.so.1(OMP_1.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
