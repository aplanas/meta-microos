SUMMARY = "API documentation for apache-commons-el"
DESCRIPTION = "API documentation for apache-commons-el."
LICENSE = "Apache-1.1"

PV = "1.0"

RPM_NAME = "apache-commons-el-javadoc-1.0-3.7.noarch.rpm"
RPM_HASH = "6708182387adf609b0c114bda932b634333fb8d602c27312079cd3dc2f92b368ac0327276537fb17d741aa0d7aa65a0d9fcf0299941fb836d91127c4285e3a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-el-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
