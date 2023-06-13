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

RPM_NAME = "python310-libxml2-2.10.4-2.1.aarch64.rpm"
RPM_HASH = "9af8027caae466f2e898292d4a28b2e88f4542429f39725346a16059b323fa893b8032e57c73ddaa6e9a5ebb33d217a4f611932a84243e8f9eb876c27bd7a32b"

RPROVIDES:${PN} += "libxml2-python \
libxml2mod.cpython-310-aarch64-linux-gnu.so()(64bit) \
python3-libxml2 \
python3-libxml2-python \
python3.10dist(libxml2-python) \
python310-libxml2 \
python310-libxml2(aarch-64) \
python310-libxml2-python \
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
python310-extras"

inherit rpm
