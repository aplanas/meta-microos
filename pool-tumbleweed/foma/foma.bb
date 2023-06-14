SUMMARY = "Finite-state compiler and C library"
DESCRIPTION = "Foma is a compiler, programming language, and C library for constructing \
finite-state automata and transducers for various uses. It has specific \
support for many natural language processing applications such as producing \
morphological analyzers. Although NLP applications are probably the main \
use of foma, it is sufficiently generic to use for a large number of purposes."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "foma-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "6b8ec3c1831dbfc37892966f4c36772350ce832a9bda9a137316a57c1c9f97a8fb640bbc793dd83eba687482d3683fd6c0f248868b3fa90ee3117a88c6379e43"

RPROVIDES:${PN} += "foma"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm
