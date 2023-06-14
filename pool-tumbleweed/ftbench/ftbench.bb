SUMMARY = "Run FreeType benchmarks"
DESCRIPTION = "Run FreeType benchmarks \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "ftbench-2.13.0-4.1.aarch64.rpm"
RPM_HASH = "b7ff3fd4ddafda0f6f74a2664e26fafcfb9042f2aac0925f5de5a4760cf78c8518101113095e2e4cc8f1c946aa3e253c7f08af8fa9e509cbf477b1c7593a25ec"

RPROVIDES:${PN} += "ftbench"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6"

inherit rpm
