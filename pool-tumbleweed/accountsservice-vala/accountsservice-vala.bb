SUMMARY = "Vala bindings for accountsservice"
DESCRIPTION = "The accountsservice server provides a set of D-Bus interfaces for \
querying and manipulating user account information. \
 \
This package contains the Vala bindings for accountservice."
LICENSE = "GPL-3.0-or-later"

PV = "23.13.9"

RPM_NAME = "accountsservice-vala-23.13.9-4.1.aarch64.rpm"
RPM_HASH = "dd31682cb7e2c44e5016db3e51b0a13eefc02d4f3b694d82bb6c54dc187c2f6da909630b0d7701d0b314eb8c8276553cd1a3a36c3b84bb112f76c09930f5481e"

RPROVIDES:${PN} += "accountsservice-vala"

RDEPENDS:${PN} += "libaccountsservice0 \
typelib-1-0-AccountsService-1-0"

inherit rpm
