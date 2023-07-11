SUMMARY = "Javadoc for eclipse-anyedit"
DESCRIPTION = "Developer documentation for eclipse-anyedit."
LICENSE = "EPL-1.0"

PV = "2.7.1"

RPM_NAME = "eclipse-anyedit-javadoc-2.7.1-2.8.noarch.rpm"
RPM_HASH = "6655f234962d627e116054095926913d5efca2629a6ec466339f7f3e0da4c5b51fb711de936744e3fae9fdfb58c2fe352e5b2dfa94aec7f7b8f0fe81aacf4705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-anyedit-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
