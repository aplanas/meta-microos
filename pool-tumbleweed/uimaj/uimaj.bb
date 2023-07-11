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

RPM_NAME = "uimaj-2.8.1-3.11.aarch64.rpm"
RPM_HASH = "9282e22d8baabe0aa271bace5ce5a0d90a7e6d7cdcb5ad0a8cecbaea5e9185df2214b472a70126f2b88a70a653dfcba910af80cb747d519f006d30b954b5af1f"

RPROVIDES:${PN} += "mvn-org.apache.uima-aggregate-uimaj-pom- \
mvn-org.apache.uima-jVinci \
mvn-org.apache.uima-jVinci-pom- \
mvn-org.apache.uima-uimaj-adapter-vinci \
mvn-org.apache.uima-uimaj-adapter-vinci-pom- \
mvn-org.apache.uima-uimaj-bootstrap \
mvn-org.apache.uima-uimaj-bootstrap-pom- \
mvn-org.apache.uima-uimaj-component-test-util \
mvn-org.apache.uima-uimaj-component-test-util-pom- \
mvn-org.apache.uima-uimaj-core \
mvn-org.apache.uima-uimaj-core-pom- \
mvn-org.apache.uima-uimaj-cpe \
mvn-org.apache.uima-uimaj-cpe-pom- \
mvn-org.apache.uima-uimaj-document-annotation \
mvn-org.apache.uima-uimaj-document-annotation-pom- \
mvn-org.apache.uima-uimaj-json \
mvn-org.apache.uima-uimaj-json-pom- \
mvn-org.apache.uima-uimaj-parent-pom- \
mvn-org.apache.uima-uimaj-pom- \
mvn-org.apache.uima-uimaj-test-util \
mvn-org.apache.uima-uimaj-test-util-pom- \
mvn-org.apache.uima-uimaj-tools \
mvn-org.apache.uima-uimaj-tools-pom- \
uimaj"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-junit-junit"

inherit rpm
