SUMMARY = "Vala bindings for accountsservice"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package contains the Vala bindings for accountservice."
LICENSE = "GPL-3.0-or-later"

PV = "22.08.8"

RPM_NAME = "accountsservice-vala-22.08.8-2.4.aarch64.rpm"
RPM_HASH = "7a2a6401d78262273faa05eeac2d8aaa05cd6bdc0205096f471ef8b25feb3ae9cc0f841e0e9e6dcfd3aa8567ccadeb0e0212710e58458af2f90a9a9ce038ae60"

RPROVIDES:${PN} += "accountsservice-vala \
accountsservice-vala(aarch-64)"
RDEPENDS:${PN} += "libaccountsservice0 \
typelib-1_0-AccountsService-1_0"

inherit rpm
