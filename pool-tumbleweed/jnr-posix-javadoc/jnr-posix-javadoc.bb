SUMMARY = "Javadoc for jnr-posix"
DESCRIPTION = "Javadoc for jnr-posix."
LICENSE = "CPL-1.0 | GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "3.1.16"

RPM_NAME = "jnr-posix-javadoc-3.1.16-3.1.noarch.rpm"
RPM_HASH = "c2e4e9e90cf850ec927d5042c3971b4af4085aec5a877ccb6b203c6e623bd487288c9298d44fa28b05eb25efb8b40ae2a036e953660a50e3098258a6da65db53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-posix-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
