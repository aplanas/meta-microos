SUMMARY = "IBM's TPM 2.0 TSS shared files"
DESCRIPTION = "Includes IBM's TPM 2.0 TSS certificates and policy files."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "ibmtss-base-1.6.0-4.4.noarch.rpm"
RPM_HASH = "a4fbf0185ebc18c2b49186ef688bdee1d8cc024d1a0c8f694f986d886dec0d9026f440fd36334eecb52f6743af0138b1c47f683a754107f026bfb4eafc779ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibmtss-base"

RDEPENDS:${PN} += "/bin/sh \
user-tss"

inherit rpm
