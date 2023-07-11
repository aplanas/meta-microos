SUMMARY = "Commons Compiler"
DESCRIPTION = "The 'commons-compiler' API, including the 'IExpressionEvaluator', \
'IScriptEvaluator', 'IClassBodyEvaluator' and 'ISimpleCompiler' interfaces."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "commons-compiler-3.1.6-1.11.noarch.rpm"
RPM_HASH = "b10f6bf3a2f212940beb6c8f097e466725e8e5756963a4a30f4ee16f1e20d0317a768d326e0155041510f0130b850cab46161130f3d4901c26a72da3ee80ce5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-compiler \
mvn-org.codehaus.janino-commons-compiler \
mvn-org.codehaus.janino-commons-compiler-pom- \
osgi-org.codehaus.janino.commons-compiler"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
