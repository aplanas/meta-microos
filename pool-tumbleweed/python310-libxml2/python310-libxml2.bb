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
libxml2mod.cpython-310-aarch64-linux-gnu.so \
python3-libxml2 \
python3-libxml2-python \
python3.10dist-libxml2-python \
python310-libxml2 \
python310-libxml2-python \
python3dist-libxml2-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2-2 \
libxml2.so.2 \
python-abi \
python310-extras"

inherit rpm
