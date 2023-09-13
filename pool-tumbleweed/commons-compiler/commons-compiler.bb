SUMMARY = "Commons Compiler"
DESCRIPTION = "The 'commons-compiler' API, including the 'IExpressionEvaluator', \
'IScriptEvaluator', 'IClassBodyEvaluator' and 'ISimpleCompiler' interfaces."
LICENSE = "BSD-3-Clause"

PV = "3.1.10"

RPM_NAME = "commons-compiler-3.1.10-2.1.noarch.rpm"
RPM_HASH = "fe11b42008684980afa6dcb62c3d59b4fc1e2626e5b4981fe7d957b8dc4114bc1faab83c8928e5fd4b68fadc6c5151a88fbf22f46c94df5283d6c31e30956b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-compiler \
mvn-org.codehaus.janino-commons-compiler \
mvn-org.codehaus.janino-commons-compiler-pom- \
osgi-org.codehaus.janino.commons-compiler"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
