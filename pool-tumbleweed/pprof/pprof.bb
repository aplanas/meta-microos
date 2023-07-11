SUMMARY = "CLI tool for visualization and analysis of profiling data"
DESCRIPTION = "pprof reads a collection of profiling samples in profile.proto format and generates reports to visualize and help analyze the data. \
It can generate both text and graphical reports (through the use of the dot visualization package)."
LICENSE = "Apache-2.0"

PV = "0.0.0+git20220520.d04f242"

RPM_NAME = "pprof-0.0.0+git20220520.d04f242-1.7.aarch64.rpm"
RPM_HASH = "0f04558075c462147db915041b10b44e8ffb362a78f89a6ce3ede35b0038ece4fde0b7fedca87bed57972ed7e18061755504f4cb618873ebbdb89521db3072c3"

RPROVIDES:${PN} += "pprof"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
