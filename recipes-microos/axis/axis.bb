SUMMARY = "Apache implementation of the SOAP"
DESCRIPTION = "Apache Axis is an implementation of the SOAP ('Simple Object Access \
Protocol') submission to W3C."
LICENSE = "Apache-2.0"

PV = "1.4"

RPM_NAME = "axis-1.4-306.6.noarch.rpm"
RPM_HASH = "ade496b6301380879ed4692ab68948a07fa8e8d1caca86b3eabb66bc4c7875f40f0e708b4e511eb795c472360930313bc620afb242bf169c114f8f3237d818d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "axis mvn(axis:axis) mvn(axis:axis-ant) mvn(axis:axis-ant:pom:) mvn(axis:axis-jaxrpc) mvn(axis:axis-jaxrpc:pom:) mvn(axis:axis-saaj) mvn(axis:axis-saaj:pom:) mvn(axis:axis:pom:) mvn(org.apache.axis:axis-ant) mvn(org.apache.axis:axis-ant:pom:) mvn(org.apache.axis:axis-jaxrpc) mvn(org.apache.axis:axis-jaxrpc:pom:) mvn(org.apache.axis:axis-saaj) mvn(org.apache.axis:axis-saaj:pom:) osgi(javax.xml.rpc) osgi(javax.xml.soap) osgi(org.apache.axis)"
RDEPENDS:${PN} += "apache-commons-httpclient apache-commons-logging glassfish-activation-api jakarta-commons-discovery java java-headless javamail javapackages-filesystem jaxp_parser_impl mvn(axis:axis-wsdl4j) mvn(commons-discovery:commons-discovery) mvn(commons-logging:commons-logging) osgi(javax.wsdl) osgi(org.apache.commons.discovery) reload4j wsdl4j"

inherit rpm
