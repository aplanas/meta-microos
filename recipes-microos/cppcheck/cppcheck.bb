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

PV = "2.9.3"

RPM_NAME = "cppcheck-2.9.3-1.1.aarch64.rpm"
RPM_HASH = "6b6e1d23fd6315272841841b709b84d8087d08f990a2d53cdd3dcf7b41ab71d4a6be7798df9f4fdd5cdca9a7b1a403374597d1fb1f0aa400872af285468a3ee7"

RPROVIDES:${PN} += "cppcheck cppcheck(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpcre.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python3-Pygments"

inherit rpm
