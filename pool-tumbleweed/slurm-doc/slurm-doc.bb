SUMMARY = "Documentation for SLURM"
DESCRIPTION = "Documentation (HTML) for the SLURM cluster managment software."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-doc-23.02.2-1.4.noarch.rpm"
RPM_HASH = "0d65da3648f019706536286f945161e8e39f727131ce0b34b449e7abced2a54697ab08b983ee7c5865c0d45b872b3b84d8c42af10755f955d9cdf552d575657e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slurm-doc"

RDEPENDS:${PN} += ""

inherit rpm
