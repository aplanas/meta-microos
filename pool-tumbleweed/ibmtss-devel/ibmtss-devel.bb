SUMMARY = "IBM's TPM 2.0 TSS headers"
DESCRIPTION = "Includes IBM's TPM 2.0 TSS C header files"
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ibmtss-devel-1.6.0-4.5.aarch64.rpm"
RPM_HASH = "3f00c125bbc92c4355fa478c53d14e0e3d3929d1a8c6d890532005abed52744cec48d89f92059bf9a242cdf49dc705d01feaa491da43f16d122d11d2a3b3be26"

RPROVIDES:${PN} += "ibmtss-devel"

RDEPENDS:${PN} += "ibmtss \
libibmtss1"

inherit rpm
