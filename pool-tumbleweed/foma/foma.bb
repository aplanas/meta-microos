SUMMARY = "Finite-state compiler and C library"
DESCRIPTION = "Foma is a compiler, programming language, and C library for constructing \
finite-state automata and transducers for various uses. It has specific \
support for many natural language processing applications such as producing \
morphological analyzers. Although NLP applications are probably the main \
use of foma, it is sufficiently generic to use for a large number of purposes."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "foma-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "e3a6e97637f0e93ba931eff3d059eedc2a362461404ebc634114dc4f0ff97b2c975c43ab577267e2c2d4bb82264576fbefadb0b600b4852d97170d1d51e91450"

RPROVIDES:${PN} += "foma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm
