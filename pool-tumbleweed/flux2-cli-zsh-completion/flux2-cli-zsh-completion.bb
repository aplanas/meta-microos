SUMMARY = "Zsh Completion for flux2-cli"
DESCRIPTION = "zsh command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "flux2-cli-zsh-completion-2.0.0-1.1.noarch.rpm"
RPM_HASH = "4850e49b63c5cdfbc44367edfb991002f899ecec495155dace1f2f45504c333e84d0feef24847ee0b7f893798b3beb499a21b6d1bcadef34a62f718b48942329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-zsh-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
