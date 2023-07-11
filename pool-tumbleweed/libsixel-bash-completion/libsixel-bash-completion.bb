SUMMARY = "Bash Completion for libsixel"
DESCRIPTION = "Bash command line completion support for libsixel."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-bash-completion-1.10.3-1.8.noarch.rpm"
RPM_HASH = "958a0c69290b6a4462f4d75d2a5cf5d9feecc6ac3db4186e68aa13fbfecada18b77919808f1e68d3cd87d1b9182acbc0b3d9a6a9e3b9db30bfcd1c7560b0f957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsixel-bash-completion"

RDEPENDS:${PN} += "bash-completion \
libsixel-utils"

inherit rpm
