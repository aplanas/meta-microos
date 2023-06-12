SUMMARY = "Apache Felix Shell Service"
DESCRIPTION = "A simple OSGi command shell service."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "felix-shell-1.4.3-4.6.noarch.rpm"
RPM_HASH = "a8da6c8c83fecfb58f55e320c0ea4e682fb283899743da1684f6bbb79d6cd3c5a18208a22252ac55a582895b1c189bcbf81570fb4d6a1648f23675770886cbda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-shell \
mvn(org.apache.felix:org.apache.felix.shell) \
mvn(org.apache.felix:org.apache.felix.shell:pom:) \
osgi(org.apache.felix.shell)"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.osgi:osgi.cmpn) \
mvn(org.osgi:osgi.core)"

inherit rpm
