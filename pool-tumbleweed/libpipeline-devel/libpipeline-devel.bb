SUMMARY = "A pipeline manipulation library"
DESCRIPTION = "libpipeline is a C library for setting up and running pipelines of \
processes, without needing to involve shell command-line parsing which \
is often error-prone and insecure. This alleviates programmers of the \
need to laboriously construct pipelines using lower-level primitives \
such as fork(2) and execve(2)."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.7"

RPM_NAME = "libpipeline-devel-1.5.7-1.3.aarch64.rpm"
RPM_HASH = "67b1863da4a522de61612c8d9900567006f1645862b04d78e4751a021c3357b1afa75bb64c64da48b2567f458ce97a963c2985f1a658caa77fc1bcd002da5235"

RPROVIDES:${PN} += "libpipeline-devel \
pkgconfig-libpipeline"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpipeline1"

inherit rpm
