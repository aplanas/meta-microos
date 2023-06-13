SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "libgccjit0-devel-gcc13-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "4cfb36863cc21a54733119ddf664d25bcf49cf147dc14bf9fa6beb0a6998d64a7d89700ed5adb037127c39266de35d5e6aa21c8736d8e2c6d28a80e23036c7be"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc13 \
libgccjit0-devel-gcc13(aarch-64)"

RDEPENDS:${PN} += "libgccjit0"

inherit rpm
