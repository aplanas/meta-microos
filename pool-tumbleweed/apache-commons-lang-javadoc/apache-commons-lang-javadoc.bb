SUMMARY = "Javadoc for apache-commons-lang"
DESCRIPTION = "Javadoc for apache-commons-lang."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "apache-commons-lang-javadoc-2.6-15.12.noarch.rpm"
RPM_HASH = "ed0fae0ec2756f6079f5488f6d35ab3205701609b8f98aa7fa02b31756fb90c27d374cd6bea9d8a854113dd3792652c99df5c339a43c3171e0a22ba1071a1f0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
