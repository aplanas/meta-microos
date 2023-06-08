SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: CORBA 2.3 Spec"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-corba-2_3-apis-1.2-36.11.noarch.rpm"
RPM_HASH = "90b50c945543d8de338e0a1ab09810a71090eb02d35be17a15f448382d4ac6565a512f4e060c122a013b4b0ccedceb6e1193eca891133b858928e851f0d8b895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "corba_2_3_apis corba_apis geronimo-corba-2_3-apis mvn(org.apache.geronimo.specs:geronimo-corba_2.3_spec) mvn(org.apache.geronimo.specs:geronimo-corba_2.3_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh java-headless javapackages-filesystem mvn(logkit:logkit)"

inherit rpm
