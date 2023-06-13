SUMMARY = "Kea DHCP server hook library"
DESCRIPTION = "The hooks framework is a Kea system that simplifies the way that \
users can write code to modify the behavior of Kea. Instead of \
altering the Kea source code, they write functions that are compiled \
and linked into one or more dynamic shared objects. The library is \
specified in the Kea configuration and, at runtime, Kea dynamically \
loads the library into its address space. At various points in the \
processing, the component 'calls out' to functions in the library, \
passing to them the data is it currently working on. They can examine \
and modify the data as required."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-hooks57-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "e0df318683056375c7d692ded9f89bfd8a86b25437a75b721808f9d197e3e11e4fa08a134ec20df220122fd1660a5cdfd4cdf1a8cd3ee7da2fac757694675b28"

RPROVIDES:${PN} += "libkea-hooks.so.57()(64bit) \
libkea-hooks57 \
libkea-hooks57(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-log.so.35()(64bit) \
libkea-util.so.52()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
