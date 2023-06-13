SUMMARY = "Javadoc for plexus-i18n"
DESCRIPTION = "Javadoc for plexus-i18n."
LICENSE = "Apache-2.0"

PV = "1.0~beta10"

RPM_NAME = "plexus-i18n-javadoc-1.0~beta10-3.6.noarch.rpm"
RPM_HASH = "e2e28df11338bf6f740b6c4e134fe5821574315bc278162f03b5d6055243fc37bac2b9706cbfa7bf8c3db11bed7c6ad124b86024a372e9ce9cc0b94d4d323b38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-i18n-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
