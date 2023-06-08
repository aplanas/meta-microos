SUMMARY = "Chocolate Doom command line completion support for bash"
DESCRIPTION = "Additions for bash-completion to support chocolate-doom."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.1"

RPM_NAME = "chocolate-doom-bash-completion-3.0.1-3.1.noarch.rpm"
RPM_HASH = "439642532fee763e95b87097db26712b8fe72ce26c678b7381f1ee17b0817faf890c00ff1daab1d5f7c8339f2e1262a00168efd4d3d4bfdb491e92273abc047c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chocolate-doom-bash-completion"
RDEPENDS:${PN} += ""

inherit rpm
