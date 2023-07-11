SUMMARY = "Javadoc for plexus-i18n"
DESCRIPTION = "Javadoc for plexus-i18n."
LICENSE = "Apache-2.0"

PV = "1.0~beta10"

RPM_NAME = "plexus-i18n-javadoc-1.0~beta10-3.7.noarch.rpm"
RPM_HASH = "59e0644d414a4b2b5a6cd87b984e1b4ecfecaf33cb4e10e9fd0977c8305764a4dfb9a0ccc8b43e7c0dedaeaea5df549355708ae5db62686c1d9259a7c0bb8791"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-i18n-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
