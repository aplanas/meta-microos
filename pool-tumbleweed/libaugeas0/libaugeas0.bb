SUMMARY = "A library for changing configuration files"
DESCRIPTION = "A library for programmatically editing configuration files. Augeas \
parses configuration files into a tree structure, which it exposes \
through its public API. Changes made through the API are written back \
to the initially read files. \
 \
The transformation works very hard to preserve comments and formatting \
details. It is controlled by ``lens'' definitions that describe the \
file format and the transformation into a tree."
LICENSE = "LGPL-2.1-or-later"

PV = "1.13.0"

RPM_NAME = "libaugeas0-1.13.0-2.1.aarch64.rpm"
RPM_HASH = "2a52eb00b1afdb804b28e30e120557b62ef80d1d7944ba2b61dadacee9dfbe4fad8a82fa19b1065659c2014323fa34bebd27db85c008feea63e0e721c19cf962"

RPROVIDES:${PN} += "libaugeas.so.0()(64bit) \
libaugeas.so.0(AUGEAS_0.1.0)(64bit) \
libaugeas.so.0(AUGEAS_0.10.0)(64bit) \
libaugeas.so.0(AUGEAS_0.11.0)(64bit) \
libaugeas.so.0(AUGEAS_0.12.0)(64bit) \
libaugeas.so.0(AUGEAS_0.14.0)(64bit) \
libaugeas.so.0(AUGEAS_0.15.0)(64bit) \
libaugeas.so.0(AUGEAS_0.16.0)(64bit) \
libaugeas.so.0(AUGEAS_0.18.0)(64bit) \
libaugeas.so.0(AUGEAS_0.20.0)(64bit) \
libaugeas.so.0(AUGEAS_0.21.0)(64bit) \
libaugeas.so.0(AUGEAS_0.22.0)(64bit) \
libaugeas.so.0(AUGEAS_0.23.0)(64bit) \
libaugeas.so.0(AUGEAS_0.24.0)(64bit) \
libaugeas.so.0(AUGEAS_0.25.0)(64bit) \
libaugeas.so.0(AUGEAS_0.8.0)(64bit) \
libaugeas0 \
libaugeas0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfa.so.1()(64bit) \
libfa.so.1(FA_1.0.0)(64bit) \
libfa.so.1(FA_1.2.0)(64bit) \
libfa.so.1(FA_1.4.0)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit)"

inherit rpm
