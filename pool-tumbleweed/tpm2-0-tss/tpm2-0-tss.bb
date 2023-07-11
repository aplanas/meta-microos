SUMMARY = "Intel's TCG Software Stack access libraries for TPM 2.0 chips"
DESCRIPTION = "The tpm2-0-tss package provides a TPM 2.0 TSS implementation. This \
implementation is developed by INTEL. This package contains the libraries, \
see the tpm2.0-abrmd package for the resource manager daemon, tpm2.0-tools for \
utilities."
LICENSE = "BSD-2-Clause"

PV = "4.0.1"

RPM_NAME = "tpm2-0-tss-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "dfa4a194e50a7c353ce533e71cf24926799ac5dbc5824b8ac95be3afc66bc20c93873e439e3ba1a8bc33c240fe9b20908f33bc9fb6ab57614887f56aaeef5b52"

RPROVIDES:${PN} += "config-tpm2-0-tss \
tpm2-0-tss"

RDEPENDS:${PN} += "/usr/bin/sh \
user-tss"

inherit rpm
