SUMMARY = "User-mode networking for unprivileged network namespaces"
DESCRIPTION = "slirp for network namespaces, without copying buffers across the namespaces."
LICENSE = "BSD-2-Clause & GPL-2.0-only & MIT"

PV = "1.2.1"

RPM_NAME = "slirp4netns-1.2.1-1.1.aarch64.rpm"
RPM_HASH = "6509f3fe8ca965ba3ebfeafa32f123351c370a46882993900a1aa18adb8861a54ec9f90ea2240eea655a1864160e65c8e9784ad8388be8064d43406d3fa65760"

RPROVIDES:${PN} += "slirp4netns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libseccomp.so.2 \
libslirp.so.0"

inherit rpm
