SUMMARY = "Tool to list content of virtual tables in a C++ shared library"
DESCRIPTION = "vtable-dumper is intended for developers of software libraries and \
maintainers of Linux distributions who are interested in ensuring \
backward binary compatibility."
LICENSE = "GPL-2.0+ | LGPL-2.0+"

PV = "1.2"

RPM_NAME = "vtable-dumper-1.2-1.19.aarch64.rpm"
RPM_HASH = "03ebeb30952063018a2b8038b9f31e7964643d4a5c7de27d5e3a76cede9d0441bc2ee482abde4c2bcda4402c0dbed2e0cb7cc902acfe264b95f8b1e5c792398d"

RPROVIDES:${PN} += "vtable-dumper \
vtable-dumper(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libelf.so.1()(64bit) \
libelf.so.1(ELFUTILS_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
