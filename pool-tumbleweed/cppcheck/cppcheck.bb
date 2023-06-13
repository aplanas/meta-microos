SUMMARY = "A tool for static C/C++ code analysis"
DESCRIPTION = "This program tries to detect bugs that your C/C++ compiler don't see. Cppcheck \
is versatile. You can check non-standard code that includes various compiler \
extensions, inline assembly code, etc. Checking covers for example these \
errors: \
 \
 * Out of bounds \
 * Uninitialized member variable 'classname::varname' \
 * Using 'memfunc' on class \
 * Using 'memfunc' on struct that contains a 'std::classname' \
 * Class Base which is inherited by class Derived does not have a virtual \
   destructor \
 * Memory leak: varname \
 * Resource leak: varname \
 * Deallocating a deallocated pointer: varname \
 * Using 'varname' after it is deallocated / released \
 * Invalid radix in call to strtol or strtoul. Must be 0 or 2-36 \
 * Overlapping data buffer varname \
 * Unsigned division. The result will be wrong. \
 * Unusual pointer arithmetic"
LICENSE = "GPL-3.0-or-later"

PV = "2.10.3"

RPM_NAME = "cppcheck-2.10.3-3.1.aarch64.rpm"
RPM_HASH = "5e8cf8727590873c4317e96b1bf351b504af7b417f84c4fa90436e7c5c7d2aa412a9902f1f7ba5b48cae596bd47ad373dde2284f99bab0ecb285e7fea9c97e1e"

RPROVIDES:${PN} += "cppcheck \
cppcheck(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpcre.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python3-Pygments"

inherit rpm
