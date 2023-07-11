SUMMARY = "A portable library for atomic memory operations"
DESCRIPTION = "Provides implementations for atomic memory update operations on a \
number of architectures. This allows direct use of these in reasonably \
portable code. Unlike earlier similar packages, this one explicitly \
considers memory barrier semantics, and allows the construction of code \
that involves minimum overhead across a variety of architectures."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "7.8.0"

RPM_NAME = "libatomic_ops-devel-7.8.0-1.2.aarch64.rpm"
RPM_HASH = "457e3e0ab95c608c1d0e595d31c08ce23ffe8b54da94c495f35f9297dfd703d4af8c6b41fd653bf437009b1bb4092ea7d9c3283959506c8165dfd33091f7ac0c"

RPROVIDES:${PN} += "libatomic-ops-devel \
pkgconfig-atomic-ops"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
