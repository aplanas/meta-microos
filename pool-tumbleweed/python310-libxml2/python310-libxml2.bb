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

RPM_NAME = "python310-libxml2-2.10.4-2.3.aarch64.rpm"
RPM_HASH = "84f73df60aeae7b29e7064c184621bc5f9dbb47bb34f14d9325e15548b37885c9c5b1eab17824951c320e2746a4025cf510c5a8f5dde8c5ee01894fe86f4452f"

RPROVIDES:${PN} += "libxml2-python \
libxml2mod.cpython-310-aarch64-linux-gnu.so \
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
