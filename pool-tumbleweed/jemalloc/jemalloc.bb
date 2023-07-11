SUMMARY = "General-purpose scalable concurrent malloc implementation"
DESCRIPTION = "jemalloc is a general-purpose scalable concurrent malloc(3) implementation. \
This package provides a shell wrapper script to run programs using jemalloc."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "jemalloc-5.3.0-1.7.aarch64.rpm"
RPM_HASH = "b04fb1645bbc65d048b612e42f80fbfeb2cfec8292258a5dec3109fb8061b242741e40044b335b0ba1fa04bd6856468ca06ae7b56e01e85cfdc656f69c6b5cfe"

RPROVIDES:${PN} += "jemalloc"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
libjemalloc2"

inherit rpm
