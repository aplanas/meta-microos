SUMMARY = "jline module for plexus-interactivity"
DESCRIPTION = "jline module for plexus-interactivity."
LICENSE = "MIT"

PV = "1.0~alpha6"

RPM_NAME = "plexus-interactivity-jline-1.0~alpha6-2.7.noarch.rpm"
RPM_HASH = "6db010b39655497d59e2a59120fb4fa4ec2cf6d65fc409c14bf6e66dcfc4b05841c237dc4e50a6ae1f19e8e102280e8d07b6fdbf53a0500f8c4cd265edd06f96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-interactivity-jline \
mvn-org.codehaus.plexus-plexus-interactivity-jline-pom- \
plexus-interactivity-jline"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jline-jline \
mvn-org.codehaus.plexus-plexus-interactivity-api \
plexus-interactivity-api"

inherit rpm
