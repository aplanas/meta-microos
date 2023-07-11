SUMMARY = "NVM Express user space tools bash completion"
DESCRIPTION = "Optional dependency offering bash completion for NVM Express user space tools"
LICENSE = "GPL-2.0-only"

PV = "2.4"

RPM_NAME = "nvme-cli-bash-completion-2.4-1.2.noarch.rpm"
RPM_HASH = "df62773922ccbfd0fb155d732c21ad173e0096e5c7c4c2956e50f4bbe2495c4b7738d14162977713db210839f0678d78432740b34b84c1871b8c1cf36780d5dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nvme-cli-bash-completion"

RDEPENDS:${PN} += "/usr/bin/sh \
bash-completion \
nvme-cli"

inherit rpm
