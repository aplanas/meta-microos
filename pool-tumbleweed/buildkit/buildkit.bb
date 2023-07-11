SUMMARY = "Toolkit for converting source code to build artifacts"
DESCRIPTION = "BuildKit is a toolkit for converting source code to build artifacts in an efficient, expressive and repeatable manner."
LICENSE = "Apache-2.0"

PV = "0.11.2"

RPM_NAME = "buildkit-0.11.2-1.5.aarch64.rpm"
RPM_HASH = "c1bdcfa31dd1e678768587cce132de2d370624cf8a5e465a04781288c01b660c3b82b94ddcaf612cc65b7fb980da8f89b429cc47ddc1fcce49e7280c6c1fd4cc"

RPROVIDES:${PN} += "buildkit"

RDEPENDS:${PN} += "/usr/bin/sh \
containerd \
libc.so.6 \
runc"

inherit rpm
