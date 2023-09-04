SUMMARY = "Documentation for salt, a parallel remote execution system"
DESCRIPTION = "This contains the documentation of salt, it is an offline version of http://docs.saltstack.com."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-doc-3006.0-2.1.aarch64.rpm"
RPM_HASH = "bb9058867ac40ca17fddfd9416a0449c7149908d4e44bbdea3f93cd00c702cf2033d566f79ef2b0ee0b74f5e22e78945a6d6f02c741ae71284bfebc95c5b3b69"

RPROVIDES:${PN} += "salt-doc"

RDEPENDS:${PN} += "salt"

inherit rpm
