SUMMARY = "Default configuration file and branding from the Plymouth upstream"
DESCRIPTION = "This package contains the /usr/share/plymouthd.defaults which contains the basic \
settings and branding from the upstream."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-branding-upstream-22.02.122+94.4bd41a3-6.1.noarch.rpm"
RPM_HASH = "551eaa6bfe893ed12bd76fbe54dcde4b657ede248c7ea6df0dca9b214c53ee1fddd9d9cdd2516d849a3680ea5aa9545e6a8abd67e3ad71f37e21356503403351"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding \
plymouth-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
