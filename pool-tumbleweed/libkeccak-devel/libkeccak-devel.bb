SUMMARY = "Development files for libkeccak"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3). \
This package contains the files required for development with libkeccak."
LICENSE = "ISC"

PV = "1.3.1.2"

RPM_NAME = "libkeccak-devel-1.3.1.2-2.4.aarch64.rpm"
RPM_HASH = "06392dd454dac3e3b93aec2d879f98a61e5ab9c21306377bc6a956ff16a8f6d69f37a054786a9d9b7abbb6064a0d4677b5749113d1e05f7b08f7d6cf1c7eb8d3"

RPROVIDES:${PN} += "libkeccak-devel"

RDEPENDS:${PN} += "libkeccak1"

inherit rpm
