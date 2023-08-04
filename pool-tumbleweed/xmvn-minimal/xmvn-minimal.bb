SUMMARY = "Dependency-reduced version of XMvn"
DESCRIPTION = "This package provides minimal version of XMvn, incapable of using \
remote repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-minimal-4.2.0-4.1.aarch64.rpm"
RPM_HASH = "bf21f3a3579a210732d9612e5366d74f7ec1d90271ca741c263d04da0977ef55c9f124b2e300df8b8352424e60b63bcf919a760547967460f73fd7078830960b"

RPROVIDES:${PN} += "libjansi.so \
xmvn-minimal"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
maven-lib \
xmvn-api \
xmvn-connector \
xmvn-core"

inherit rpm
