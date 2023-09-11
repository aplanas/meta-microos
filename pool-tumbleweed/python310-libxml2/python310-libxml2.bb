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

RPM_NAME = "python310-libxml2-2.10.4-3.1.aarch64.rpm"
RPM_HASH = "4369be19277e74e1cb4ecb5d5b4a7165e0e6c3699162838887988bc5ad5834b28f2e8bf1c66944c649a0a099449041014dfc81c4d37b0a7fed7f4c8148a5f5f3"

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
