SUMMARY = "Vala bindings for accountsservice"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package contains the Vala bindings for accountservice."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-vala-23.13.9-3.1.aarch64.rpm"
RPM_HASH = "22028a9dd80cc032e8d91471b495e84dcb111c7b0e04b7eaf4fa204361776aba9cd17a63797abc4af9b576517e411b967e17a84446a1e8effdef152228cb9d7a"

RPROVIDES:${PN} += "accountsservice-vala"

RDEPENDS:${PN} += "libaccountsservice0 \
typelib-1-0-AccountsService-1-0"

inherit rpm
