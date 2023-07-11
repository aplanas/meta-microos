SUMMARY = "OPENLDAP module for Qore"
DESCRIPTION = "This package contains the openldap module for the Qore Programming Language. \
 \
This module exposes functionality from the openldap library as a Qore API."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.2"

RPM_NAME = "qore-openldap-module-1.2-1.4.aarch64.rpm"
RPM_HASH = "2e6b515282301a1e7209d4999937acb3b9d64b44f1ae6a3d29b59943fc2450cf9f58fbf6bc71e397b29a0b7a56f56e9e0be0a4d4621db592c3c25e7e6f2f10fe"

RPROVIDES:${PN} += "qore-openldap-module"

RDEPENDS:${PN} += "/usr/bin/env \
libc.so.6 \
libgcc-s.so.1 \
libldap.so.2 \
libstdc++.so.6 \
qore-module-abi"

inherit rpm
