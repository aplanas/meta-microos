SUMMARY = "Performance Tools for C++"
DESCRIPTION = "The gperftools package contains some utilities to improve and analyze the \
performance of C++ programs.  This includes an optimized thread-caching \
malloc() and cpu and heap profiling utilities."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-2.10-1.6.aarch64.rpm"
RPM_HASH = "a613a48ba1d50cc6eb1bdc9b5f6f0ebff549f135885bf9f7cf012aed5ef8e82115c49ce0a7c04e1319dfd44b605ff7118c84a6d3ad6fdf3cb2faebf69775e0e7"

RPROVIDES:${PN} += "google-perftools \
gperftools"

RDEPENDS:${PN} += "/usr/bin/env \
pprof"

inherit rpm
