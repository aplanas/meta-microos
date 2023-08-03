SUMMARY = "OPENLDAP module for Qore"
DESCRIPTION = "This package contains the openldap module for the Qore Programming Language. \
 \
This module exposes functionality from the openldap library as a Qore API."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "qore-openldap-module-1.2.3-2.1.aarch64.rpm"
RPM_HASH = "d4c22de16cb161acaa0a8634cc5d3d06c5e5709c1bd250ad91e4664400bfec2cb5f299391ac2984c3399d8658ee7c41232866f7b6461f9cca29df4b203fc5d31"

RPROVIDES:${PN} += "qore-openldap-module"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libldap.so.2 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
