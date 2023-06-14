SUMMARY = "TreeLayout Core Demo"
DESCRIPTION = "Demo for 'org.abego.treelayout.core'."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "treelayout-demo-1.0.3-3.10.noarch.rpm"
RPM_HASH = "302aa583f54a247c6ad3cc546a7c3dd81fe1851a89215682fff5a7c651328f5fd114b9e7e02196125cfb253167e2f284be6cb73d5c853056041170b48055ce55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.abego.treelayout-org.abego.treelayout.demo \
mvn-org.abego.treelayout-org.abego.treelayout.demo-pom- \
treelayout-demo"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.abego.treelayout-org.abego.treelayout.core"

inherit rpm
