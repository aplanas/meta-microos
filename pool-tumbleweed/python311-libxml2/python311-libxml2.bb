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

RPM_NAME = "python311-libxml2-2.10.4-2.3.aarch64.rpm"
RPM_HASH = "e345a18bc49c917a1e168b46272cba7509f4741bcb378ba2e07f9b091ece6d40cd4d907834bc0e47c1877cd41dfa4e0a7d92aa77cc9e473a2034f2df66e6f3e0"

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
