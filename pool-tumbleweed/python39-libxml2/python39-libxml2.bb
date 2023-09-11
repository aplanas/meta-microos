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

RPM_NAME = "python39-libxml2-2.10.4-3.1.aarch64.rpm"
RPM_HASH = "a6ac8caa918ec3c2f342f902f97d722bb158e528e427883b9a2bb46d812ff08c12722d4d287d28cd42171ce39cc75e9a6bb29b174168cf1572ac0afb9b18e047"

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
