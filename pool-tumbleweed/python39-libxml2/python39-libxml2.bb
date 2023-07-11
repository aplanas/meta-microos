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

RPM_NAME = "python39-libxml2-2.10.4-2.3.aarch64.rpm"
RPM_HASH = "9f505c41020a3cff314322c4f76c7dfadacd0caaf3b19074b8903fdbba9eb774ac8d2d709c85b237d35b23b5ea30eedc8b68fb71b2d15b8ef23bd30888958f82"

RPROVIDES:${PN} += "libxml2-python \
libxml2mod.cpython-39-aarch64-linux-gnu.so \
python3.9dist-libxml2-python \
python39-libxml2 \
python39-libxml2-python \
python3dist-libxml2-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2-2 \
libxml2.so.2 \
python-abi \
python39-extras"

inherit rpm
