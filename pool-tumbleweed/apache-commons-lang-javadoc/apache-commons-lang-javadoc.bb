SUMMARY = "Javadoc for apache-commons-lang"
DESCRIPTION = "Javadoc for apache-commons-lang."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "apache-commons-lang-javadoc-2.6-15.11.noarch.rpm"
RPM_HASH = "637153ab56d0f9efc69fb8d7fb4361163addf955da89cfbae3a39f5fce91d05133cb6c8cf98acf6ecb662497733dc22e5aabf1406af901affc087a76a6568840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-lang-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
