SUMMARY = "Compiler for the Zig language"
DESCRIPTION = "General-purpose programming language and toolchain for maintaining robust, optimal, and reusable software. \
 \
* Robust - behavior is correct even for edge cases such as out of memory. \
* Optimal - write programs the best way they can behave and perform. \
* Reusable - the same code works in many environments which have different constraints. \
* Maintainable - precisely communicate intent to the compiler and other programmers. \
The language imposes a low overhead to reading code and is resilient to changing requirements and environments."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "zig-0.10.1-2.3.aarch64.rpm"
RPM_HASH = "f21255e7e251af3d2377168dc25921f926f23b1ee1f260c16928c72fca87a25b3fd376543008b9604987b00b5fc7011e6c378c5e7f2adc890cae81c747e06be4"

RPROVIDES:${PN} += "zig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLLVM.so.15 \
libc.so.6 \
libclang-cpp.so.15 \
libm.so.6 \
libstdc++.so.6 \
lld15 \
zig-libs"

inherit rpm
