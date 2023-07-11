SUMMARY = "IBM's TPM 2.0 TSS shared files"
DESCRIPTION = "Includes IBM's TPM 2.0 TSS certificates and policy files."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ibmtss-base-1.6.0-4.5.noarch.rpm"
RPM_HASH = "916df05b0ddcc9214b6362ff685fe4f3a653c17a9e1d32e4f177ea007567363fa13d1d61ce9a846fd8a69fa886c778c0072e91783f047509e290ea0d36043e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibmtss-base"

RDEPENDS:${PN} += "/usr/bin/sh \
user-tss"

inherit rpm
