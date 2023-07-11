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

RPM_NAME = "zig-0.10.1-2.4.aarch64.rpm"
RPM_HASH = "c9484fdded6f94b57e29ee79f086794150375ce57f198e11432574ae2638eeae30171a8bdacfd9e5aca4628bfb3ca846f05dce8570443e781e20ab08e30de54a"

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
