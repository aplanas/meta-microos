SUMMARY = "CLI tool for visualization and analysis of profiling data"
DESCRIPTION = "pprof reads a collection of profiling samples in profile.proto format and generates reports to visualize and help analyze the data. \
It can generate both text and graphical reports (through the use of the dot visualization package)."
LICENSE = "Apache-2.0"

PV = "0.0.0+git20230820.407c9e7"

RPM_NAME = "pprof-0.0.0+git20230820.407c9e7-1.1.aarch64.rpm"
RPM_HASH = "2655e29bee1a9905c97cf0ceea19596ab7532b47f7e6325415f0f31136e48a331d65bad077f06b2f378c7c62eb4aafaeb49b090615d26a554b44a18d7d7a1763"

RPROVIDES:${PN} += "pprof"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
