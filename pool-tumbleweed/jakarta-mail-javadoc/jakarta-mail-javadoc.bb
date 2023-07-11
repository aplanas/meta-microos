SUMMARY = "Javadoc for jakarta-mail"
DESCRIPTION = "This package contains javadoc for jakarta-mail."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.0"

RPM_NAME = "jakarta-mail-javadoc-2.1.0-1.7.noarch.rpm"
RPM_HASH = "2e2eaf3c9a1b8d044eb21faa20256749f94dd06fdc22b68c78e99900010469f43fe6b8affcfdd43a90ac36caa9fd9027d0d2687670a124a8fcf7c3d7f1aa0f84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-mail-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
