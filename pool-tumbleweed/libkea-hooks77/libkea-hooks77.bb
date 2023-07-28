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

PV = "2.4.0"

RPM_NAME = "libkea-hooks77-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "dc130b1edc64c098480e2753f6961fa43c652db39441c430a622fa35ffb977b77dc850aa04c6906754527a1ffbebb34232e7e456148eb58eef73d35dd9e8b2cd"

RPROVIDES:${PN} += "libkea-hooks.so.77 \
libkea-hooks77"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-cc.so.54 \
libkea-exceptions.so.23 \
libkea-log.so.48 \
libkea-util.so.68 \
libstdc++.so.6"

inherit rpm
