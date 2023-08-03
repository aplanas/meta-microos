SUMMARY = "Development files for libkeccak"
DESCRIPTION = "libkeccak is a bit-oriented lanewise implementation of the Keccak \
family with support for extend output size, state marshalling, \
algorithm tuning with implicit parameters, secure erasure of \
sensitive data, and HMAC. \
 \
A subset of Keccak was specified by NIST as SHA-3 (Secure Hash Algorithm 3). \
This package contains the files required for development with libkeccak."
LICENSE = "ISC"

PV = "1.4"

RPM_NAME = "libkeccak-devel-1.4-1.1.aarch64.rpm"
RPM_HASH = "827fcc1ede9b1db1e8adb17c634f229edfe090bd083211afa4918dca5fc3eadeb8d0c5c1d6bff799d6cb819964dfa09eef5f5d7852be14c90cef059b8207e8e7"

RPROVIDES:${PN} += "libkeccak-devel"

RDEPENDS:${PN} += "libkeccak1"

inherit rpm
