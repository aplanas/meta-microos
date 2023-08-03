SUMMARY = "Intel's TCG Software Stack access libraries for TPM 2.0 chips"
DESCRIPTION = "The tpm2-0-tss package provides a TPM 2.0 TSS implementation. This \
implementation is developed by INTEL. This package contains the libraries, \
see the tpm2.0-abrmd package for the resource manager daemon, tpm2.0-tools for \
utilities."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "tpm2-0-tss-4.0.1-2.1.aarch64.rpm"
RPM_HASH = "42a9c689b543581b3ac13a1963e6c44af5f19a781c80a15c18191fc44e51bee22a59eab47cb5b387a799a580cc305fc1918a4b33056b71d2cf455b263cb3c4e8"

RPROVIDES:${PN} += "config-tpm2-0-tss \
tpm2-0-tss"

RDEPENDS:${PN} += "/usr/bin/sh \
user-tss"

inherit rpm
