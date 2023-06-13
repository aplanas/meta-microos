SUMMARY = "Bash completion for tpm2-tss-engine"
DESCRIPTION = "Optional dependency offering bash completion for the tpm2-tss-engine project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "tpm2-tss-engine-bash-completion-1.2.0-2.1.noarch.rpm"
RPM_HASH = "1b35cd31dc69c55d5aea1661b27328700f434ccc16e576c7d72470d6ab990f49d7a72f21a36b96c7bc679e1090783a6a9f434a5bff1e2234faf504bc05d2b0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tpm2-tss-engine-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tpm2-tss-engine"

inherit rpm
