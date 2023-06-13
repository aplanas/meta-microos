SUMMARY = "Root Plexus Projects POM"
DESCRIPTION = "The Plexus project provides a full software stack for creating and \
executing software projects.  This package provides parent POM for \
Plexus packages."
LICENSE = "Apache-2.0"

PV = "5.1"

RPM_NAME = "plexus-pom-5.1-1.11.noarch.rpm"
RPM_HASH = "74e08f9e34123dd3573c52cb34d414b28575731ee10c48f671298613219f7fa3674a25cb5f7fea34a55a1dcb9ea56afd0a6d446780cf5bb5e6be5c51f89c0165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus:pom:) \
plexus-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
