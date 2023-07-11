SUMMARY = "Apache UIMA Parent POM"
DESCRIPTION = "UIMA (Unstructured Information Management Architecture). \
UIMA promotes community development and reuse of annotators \
that extract meta-data from unstructured information (text, \
audio, video, etc.); it provides for externalized declaration of \
type systems, component configuration, aggregation, and more, \
supports scalablity, and provides tooling. \
 \
This package provides Parent for Apache UIMA Projects."
LICENSE = "Apache-2.0"

PV = "10"

RPM_NAME = "uima-parent-pom-10-1.19.noarch.rpm"
RPM_HASH = "c1ce66d8363ceb2a99537c9ee331bd6936925882b9d754e6c201a2e6ee8d8b9573772443b52f6866b9c7c89f26e46891a3399e65111467bcbaffdd3d080907b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.uima-parent-pom-pom- \
uima-parent-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom- \
mvn-org.apache.maven.plugins-maven-antrun-plugin \
mvn-org.apache.maven.plugins-maven-enforcer-plugin \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm
