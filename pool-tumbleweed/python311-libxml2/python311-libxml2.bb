SUMMARY = "Python  Bindings for libxml2-python"
DESCRIPTION = "This package contains a module that permits \
applications written in the Python programming language to use the \
interface supplied by the libxml2 library to manipulate XML files. \
 \
This library allows manipulation of XML files. It includes support for \
reading, modifying, and writing XML and HTML files. There is DTD \
support that includes parsing and validation even with complex DTDs, \
either at parse time or later once the document has been modified."
LICENSE = "MIT"

PV = "2.10.4"

RPM_NAME = "python311-libxml2-2.10.4-2.1.aarch64.rpm"
RPM_HASH = "af7c6c0bf9abf5224a9d7d86aaa66ab50ae0a160eb5c561d00a29c807b0b1c84038be4fd5deae5b89336c0182801dcf694fef4cbc5854989227ed1aed45c3f4e"

RPROVIDES:${PN} += "libxml2-python \
libxml2mod.cpython-311-aarch64-linux-gnu.so()(64bit) \
python3.11dist(libxml2-python) \
python311-libxml2 \
python311-libxml2(aarch-64) \
python311-libxml2-python \
python3dist(libxml2-python)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libxml2-2 \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.2)(64bit) \
libxml2.so.2(LIBXML2_2.5.4)(64bit) \
libxml2.so.2(LIBXML2_2.5.6)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.5.8)(64bit) \
libxml2.so.2(LIBXML2_2.5.9)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.1)(64bit) \
libxml2.so.2(LIBXML2_2.6.10)(64bit) \
libxml2.so.2(LIBXML2_2.6.11)(64bit) \
libxml2.so.2(LIBXML2_2.6.12)(64bit) \
libxml2.so.2(LIBXML2_2.6.14)(64bit) \
libxml2.so.2(LIBXML2_2.6.15)(64bit) \
libxml2.so.2(LIBXML2_2.6.16)(64bit) \
libxml2.so.2(LIBXML2_2.6.17)(64bit) \
libxml2.so.2(LIBXML2_2.6.18)(64bit) \
libxml2.so.2(LIBXML2_2.6.2)(64bit) \
libxml2.so.2(LIBXML2_2.6.20)(64bit) \
libxml2.so.2(LIBXML2_2.6.21)(64bit) \
libxml2.so.2(LIBXML2_2.6.23)(64bit) \
libxml2.so.2(LIBXML2_2.6.25)(64bit) \
libxml2.so.2(LIBXML2_2.6.27)(64bit) \
libxml2.so.2(LIBXML2_2.6.28)(64bit) \
libxml2.so.2(LIBXML2_2.6.3)(64bit) \
libxml2.so.2(LIBXML2_2.6.5)(64bit) \
libxml2.so.2(LIBXML2_2.6.6)(64bit) \
libxml2.so.2(LIBXML2_2.6.8)(64bit) \
libxml2.so.2(LIBXML2_2.7.0)(64bit) \
libxml2.so.2(LIBXML2_2.7.3)(64bit) \
libxml2.so.2(LIBXML2_2.8.0)(64bit) \
libxml2.so.2(LIBXML2_2.9.0)(64bit) \
libxml2.so.2(LIBXML2_2.9.1)(64bit) \
libxml2.so.2(LIBXML2_2.9.11)(64bit) \
python(abi) \
python311-extras"

inherit rpm
