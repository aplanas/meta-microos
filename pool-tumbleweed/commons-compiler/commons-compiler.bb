SUMMARY = "Commons Compiler"
DESCRIPTION = "The 'commons-compiler' API, including the 'IExpressionEvaluator', \
'IScriptEvaluator', 'IClassBodyEvaluator' and 'ISimpleCompiler' interfaces."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "commons-compiler-3.1.10-1.1.noarch.rpm"
RPM_HASH = "36d7ecb87d7e17a7a80fbdd6e0bcc13b7dc9a70338204a74c6b3afbb94d0462db54c2be19b1b9126ec679a2af5c494760c5dd41fdead32132183842fc52ccccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-compiler \
mvn-org.codehaus.janino-commons-compiler \
mvn-org.codehaus.janino-commons-compiler-pom- \
osgi-org.codehaus.janino.commons-compiler"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
