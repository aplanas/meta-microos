SUMMARY = "Extra compiler support for plexus-compiler"
DESCRIPTION = "Additional support for csharp, eclipse and jikes compilers"
LICENSE = "Apache-2.0"

PV = "2.11.1"

RPM_NAME = "plexus-compiler-extras-2.11.1-3.4.noarch.rpm"
RPM_HASH = "9679e11c8146062cbd694ed9395d5efeb129637f3e291dc36911ec1a14508415802dba3b9fb58bc03d12b32e529745363aef7aa589b4875b0dae6838ed9f3187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.codehaus.plexus:plexus-compiler-csharp) \
mvn(org.codehaus.plexus:plexus-compiler-csharp:pom:) \
mvn(org.codehaus.plexus:plexus-compiler-eclipse) \
mvn(org.codehaus.plexus:plexus-compiler-eclipse:pom:) \
plexus-compiler-extras"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.codehaus.plexus:plexus-compiler-api) \
mvn(org.codehaus.plexus:plexus-component-annotations) \
mvn(org.codehaus.plexus:plexus-utils) \
mvn(org.eclipse.jdt:ecj)"

inherit rpm
