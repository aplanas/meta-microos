SUMMARY = "Busybox applets containing adduser and some shadow tools"
DESCRIPTION = "This package contains the symlinks for adduser and some tools from the \
shadow suite."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-adduser-1.36.1-29.1.noarch.rpm"
RPM_HASH = "13358536723169851b88441ab325b18f7d71c1c203f23dc7b17d997d939bfb620bb54b60ff11731a44156bcf47ea24e1c08fe0329e94edbbb3383f9ca0cbc09a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-adduser"

RDEPENDS:${PN} += "busybox \
group-nogroup"

inherit rpm
