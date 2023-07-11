SUMMARY = "Javadoc for apache-commons-email"
DESCRIPTION = "This package contains the API documentation for apache-commons-email."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "apache-commons-email-javadoc-1.5-5.7.noarch.rpm"
RPM_HASH = "fb047b16e76e3583f04b70899f5c6ac1af78825ca318c39ab3b499c6eb1123e9d1ec76847b71b2888ea6e7c6c9acd15630c0fdbf7d57b3e6fb6a26ed0a9f080f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-email-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
