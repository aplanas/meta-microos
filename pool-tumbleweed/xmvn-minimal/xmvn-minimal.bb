SUMMARY = "Dependency-reduced version of XMvn"
DESCRIPTION = "This package provides minimal version of XMvn, incapable of using \
remote repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-minimal-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "2233f5f0d68a5f63802cc38f9c91de6b7feb2c63426205df20cd2e93cc83c955d892fe59f0cb3be02a3123b00f373ef71ad88ea8bc658cd3cc7b9054d7bd36b0"

RPROVIDES:${PN} += "libjansi.so \
xmvn-minimal"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
maven-lib \
xmvn-api \
xmvn-connector \
xmvn-core"

inherit rpm
