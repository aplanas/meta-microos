SUMMARY = "Zsh Completion for pluto"
DESCRIPTION = "Zsh command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.1"

RPM_NAME = "pluto-zsh-completion-5.18.1-1.1.noarch.rpm"
RPM_HASH = "6e0d11956f36802421f01cf69feb1f8d5d1ef1ba2b6afc3b2aab9308217298da209486585218a4bf7e809323a18deecc4f09f49f5258cd3117bd796554ab2e82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-zsh-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
