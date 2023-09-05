SUMMARY = "Documentation for salt, a parallel remote execution system"
DESCRIPTION = "This contains the documentation of salt, it is an offline version of http://docs.saltstack.com."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-doc-3006.0-4.1.aarch64.rpm"
RPM_HASH = "733b3f621d6d135e77223e13dcb2abcabab426c5192f6ff12713b805444a14bffcf4a54a6b5884d80938a613739a6ca61a419336f6ea5894e68faab8a3aa1784"

RPROVIDES:${PN} += "salt-doc"

RDEPENDS:${PN} += "salt"

inherit rpm
