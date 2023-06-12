SUMMARY = "Javadoc for tagsoup"
DESCRIPTION = "Javadoc package for tagsoup."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "tagsoup-javadoc-1.2.1-5.3.noarch.rpm"
RPM_HASH = "7be82a9e768eca264f3e1812bf0a1c5618f42fd104f4340b23099c6b39000357ad559c80127cffcabea55417084334d672a03445d057f99299fc7f338b2e67df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tagsoup-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
