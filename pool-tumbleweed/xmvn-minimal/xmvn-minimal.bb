SUMMARY = "Dependency-reduced version of XMvn"
DESCRIPTION = "This package provides minimal version of XMvn, incapable of using \
remote repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-minimal-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "e740680999405d68499600c1ec643524d25ddc612ae968e57db2bcf895db37f1af3f711c27bd9197fc507bbe5e4152d8bbe374ea9b6f8985020607264ad98a03"

RPROVIDES:${PN} += "libjansi.so \
xmvn-minimal"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
maven-lib \
xmvn-api \
xmvn-connector \
xmvn-core"

inherit rpm
