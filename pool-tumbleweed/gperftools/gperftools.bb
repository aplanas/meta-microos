SUMMARY = "Performance Tools for C++"
DESCRIPTION = "The gperftools package contains some utilities to improve and analyze the \
performance of C++ programs.  This includes an optimized thread-caching \
malloc() and cpu and heap profiling utilities."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-2.10-1.5.aarch64.rpm"
RPM_HASH = "28479ad16a6423fb4ba2c9d045115237f10efb2d1a5b6b0a56303ccf4d60609a1ad7d76624a915d858d0893080c2b0b3f7b66e486ffbcf0cce078adec16fc9da"

RPROVIDES:${PN} += "google-perftools \
gperftools \
gperftools(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/env \
pprof"

inherit rpm
