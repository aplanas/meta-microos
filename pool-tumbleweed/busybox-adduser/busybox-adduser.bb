SUMMARY = "Busybox applets containing adduser and some shadow tools"
DESCRIPTION = "This package contains the symlinks for adduser and some tools from the \
shadow suite."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-adduser-1.36.1-30.1.noarch.rpm"
RPM_HASH = "b31ab58c384fa7f5af75ac56cc187b38b88921fb6e32682962e5cff9f1d95072e40f194bad2c59af4b90d08095ed13205594ca7a850c116d1163f755790fe503"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-adduser"

RDEPENDS:${PN} += "busybox \
group-nogroup"

inherit rpm
