SUMMARY = "Apache UIMA is an implementation of the OASIS-UIMA specifications"
DESCRIPTION = "Apache UIMA is an implementation of the OASIS-UIMA specifications. \
 \
OASIS UIMA Committee: <http://www.oasis-open.org/committees/uima/>. \
 \
Unstructured Information Management applications are software systems \
that analyze large volumes of unstructured information in order to \
discover knowledge that is relevant to an end user. \
 \
An example UIM application might ingest plain text and identify \
entities, such as persons, places, organizations; or relations, \
such as works-for or located-at."
LICENSE = "Apache-2.0"

PV = "2.8.1"

RPM_NAME = "uimaj-2.8.1-3.10.aarch64.rpm"
RPM_HASH = "0851ccf501e2a73cbda8100939c1ff1fabdfe69280c05dd82539775bb574ecd8d29c37211249fb52d8544685bbf0b359a73c7c885e8af26c3c16e126f3dbe6ba"

RPROVIDES:${PN} += "mvn(org.apache.uima:aggregate-uimaj:pom:) \
mvn(org.apache.uima:jVinci) \
mvn(org.apache.uima:jVinci:pom:) \
mvn(org.apache.uima:uimaj-adapter-vinci) \
mvn(org.apache.uima:uimaj-adapter-vinci:pom:) \
mvn(org.apache.uima:uimaj-bootstrap) \
mvn(org.apache.uima:uimaj-bootstrap:pom:) \
mvn(org.apache.uima:uimaj-component-test-util) \
mvn(org.apache.uima:uimaj-component-test-util:pom:) \
mvn(org.apache.uima:uimaj-core) \
mvn(org.apache.uima:uimaj-core:pom:) \
mvn(org.apache.uima:uimaj-cpe) \
mvn(org.apache.uima:uimaj-cpe:pom:) \
mvn(org.apache.uima:uimaj-document-annotation) \
mvn(org.apache.uima:uimaj-document-annotation:pom:) \
mvn(org.apache.uima:uimaj-json) \
mvn(org.apache.uima:uimaj-json:pom:) \
mvn(org.apache.uima:uimaj-parent:pom:) \
mvn(org.apache.uima:uimaj-test-util) \
mvn(org.apache.uima:uimaj-test-util:pom:) \
mvn(org.apache.uima:uimaj-tools) \
mvn(org.apache.uima:uimaj-tools:pom:) \
mvn(org.apache.uima:uimaj:pom:) \
uimaj \
uimaj(aarch-64)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(junit:junit)"

inherit rpm
