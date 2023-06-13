SUMMARY = "Development files for mcpp"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98. \
 \
This package holds the development files for libev."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "mcpp-devel-2.7.2-24.14.aarch64.rpm"
RPM_HASH = "50449443054440e072759d4479ef1189e51e53d6a76851a3e0cebead5f18d95f516fdb2c528cfdc0e625778006dbcc9b3fac9da8769d965aece6ef0300cfa902"

RPROVIDES:${PN} += "mcpp-devel \
mcpp-devel(aarch-64)"

RDEPENDS:${PN} += "libmcpp0 \
mcpp"

inherit rpm
