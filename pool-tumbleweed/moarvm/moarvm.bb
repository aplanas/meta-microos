SUMMARY = "A virtual machine built especially for Rakudo"
DESCRIPTION = "Short for 'Metamodel On A Runtime', MoarVM is a modern virtual machine built \
for the Rakudo compiler implementing the Raku Programming Language, and the \
NQP Compiler Toolchain. MoarVM is used by the majority of Raku programmers. \
Highlights include: \
 \
Great Unicode support, with strings represented at grapheme level \
Dynamic analysis of running code to identify hot functions and loops, and \
perform a range of optimizations, including type specialization and inlining \
Support for threads, a range of concurrency control constructs, and asynchronous \
sockets, timers, processes, and more \
Generational, parallel, garbage collection"
LICENSE = "Artistic-2.0"

PV = "2022.07"

RPM_NAME = "moarvm-2022.07-4.4.aarch64.rpm"
RPM_HASH = "efe78378851ba25c0d1a648e065aab944ebea6bfaf50e134de5ac863acf58a30c24374e2f936a98a506119986939591727208efc0c3c318247c9f5d64881301f"

RPROVIDES:${PN} += "libmoar.so \
moarvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libm.so.6 \
libtommath.so.1 \
libuv.so.1 \
libzstd.so.1"

inherit rpm
