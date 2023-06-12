SUMMARY = "Bash Completion for libsixel"
DESCRIPTION = "Bash command line completion support for libsixel."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-bash-completion-1.10.3-1.7.noarch.rpm"
RPM_HASH = "d450af990ef1126d23608e8f01207b711b561e524271721309d7a26fbe6484cfcd965ee1eb73f171e0769a701100e00dd7ddeabd09e81e5eb83dfcea17db9f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsixel-bash-completion"
RDEPENDS:${PN} += "bash-completion \
libsixel-utils"

inherit rpm
