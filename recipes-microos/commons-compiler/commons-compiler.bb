SUMMARY = "Commons Compiler"
DESCRIPTION = "The 'commons-compiler' API, including the 'IExpressionEvaluator', \
'IScriptEvaluator', 'IClassBodyEvaluator' and 'ISimpleCompiler' interfaces."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "commons-compiler-3.1.6-1.10.noarch.rpm"
RPM_HASH = "3f8eb82cd6fa24d8e4b453f51bebf5865269cb2114a2312d9b357f30a288b0616f77c6bce2810675d1bbc41a894c71c44da00e7af62f203103ea40d8e60ba165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "commons-compiler \
mvn(org.codehaus.janino:commons-compiler) \
mvn(org.codehaus.janino:commons-compiler:pom:) \
osgi(org.codehaus.janino.commons-compiler)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
