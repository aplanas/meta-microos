SUMMARY = "Profiler for gtk-sharp3"
DESCRIPTION = "A profiler called 'gui-thread-check' is included as \
part of the install for debugging purposes."
LICENSE = "GPL-2.0-only"

PV = "2.99.4"

RPM_NAME = "libmono-profiler-gui-thread-check0-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "8a183556b1281220608770c884b071b7d178ddb74e2c6616c4c126f8d5e229e869ad50452c59eb4f5e59bf3350095d51db0339c2b5999afda47d2433b5e64f29"

RPROVIDES:${PN} += "libmono-profiler-gui-thread-check.so.0 \
libmono-profiler-gui-thread-check0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libglib-2.0.so.0 \
libmonosgen-2.0.so.1"

inherit rpm
