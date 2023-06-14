SUMMARY = "Python3 binding for the GObject Dara Mapper"
DESCRIPTION = "This is a DataMapper for GObject. \
 \
With this package you can glue gom to python3."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4"

RPM_NAME = "python3-gom-0.4-1.15.aarch64.rpm"
RPM_HASH = "25798584a72ab6b0aa38497af96e8d891463b7537a500bc838c34d26dc7d2b888210839ab434366f0d36b095d7c8aec937fb079b544e94cc995db7148a2bf648"

RPROVIDES:${PN} += "python3-gom"

RDEPENDS:${PN} += "python-abi \
typelib-Gom"

inherit rpm
