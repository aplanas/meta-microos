SUMMARY = "Parent POM for signpost-core"
DESCRIPTION = "This package contains the Parent POM for signpost-core."
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "oauth-signpost-1.2.1.2-3.10.noarch.rpm"
RPM_HASH = "3178fa3b6768b1561e0c69d8623920817f53f31ef7c74c1ac209d0b52837b56b4b7039076291d96c4e55ceabbd6c790584257977daf5577526101519fe5b3a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(oauth.signpost:oauth-signpost:pom:) \
oauth-signpost"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.apache.maven.plugins:maven-compiler-plugin) \
mvn(org.apache.maven.plugins:maven-jar-plugin)"

inherit rpm
