SUMMARY = "Javadoc for javassist"
DESCRIPTION = "Javadoc for javassist. \
 \
Javadoc for javassist."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "3.29.2"

RPM_NAME = "javassist-javadoc-3.29.2-2.1.noarch.rpm"
RPM_HASH = "d5fa80765793e8320d9d0bea5fef6d4a0e16386ad52d0ad43e0eabea1bb74e9cfe0a83ecdd6ae5447c4d250224cc3fe98f9f1ecf2801644cbc2f1e5ef82ec2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javassist-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
