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

RPM_NAME = "python311-libxml2-2.10.4-3.1.aarch64.rpm"
RPM_HASH = "2d6ec3d52f06502274c19ef1df01f3c90a3531d22c1e5050ae52b2d416d46c181002b6111a993dc67f6c96fc733ead43b8cc6d90e0f1d3fe99482a959b08e8af"

RPROVIDES:${PN} += "libxml2-python \
libxml2mod.cpython-311-aarch64-linux-gnu.so \
python3-libxml2 \
python3-libxml2-python \
python3.11dist-libxml2-python \
python311-libxml2 \
python311-libxml2-python \
python3dist-libxml2-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2-2 \
libxml2.so.2 \
python-abi \
python311-extras"

inherit rpm
