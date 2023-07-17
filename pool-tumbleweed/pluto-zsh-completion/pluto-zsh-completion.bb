SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.0"

RPM_NAME = "pluto-zsh-completion-5.18.0-1.1.noarch.rpm"
RPM_HASH = "17b56df8885d95f4b71c96e74a629742e7257d42fc5be323ff16c9e574fb123cd841ad72cfd929d2a71785db3d885373db19f0959e96dc49ddfea28ac8509810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
