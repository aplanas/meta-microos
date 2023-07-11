SUMMARY = "Documentation for salt, a parallel remote execution system"
DESCRIPTION = "This contains the documentation of salt, it is an offline version of http://docs.saltstack.com."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-doc-3006.0-1.4.aarch64.rpm"
RPM_HASH = "aa9f743bf4ca839ce03006c71dc4c99688bed5459d06fd16dabf992991794a700beb720dfdc0138dc5d8629b28cd3f5cb6331d3353466d869feed4e8d0f07860"

RPROVIDES:${PN} += "salt-doc"

RDEPENDS:${PN} += "salt"

inherit rpm
