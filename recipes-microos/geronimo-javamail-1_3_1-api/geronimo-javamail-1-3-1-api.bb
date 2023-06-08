SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: JavaMail API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-javamail-1_3_1-api-1.2-36.11.noarch.rpm"
RPM_HASH = "3446d5f69a2444cdfeb870ed85eeac525530343b9e7f243120a84eb04884cc2424221345e2a92c953978237e5d5bb81b7b16b97bb5cb58c17dc55e211c139adc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-javamail-1_3_1-api javamail_1_3_1_api javamail_api mvn(org.apache.geronimo.specs:geronimo-javamail_1.3.1_spec) mvn(org.apache.geronimo.specs:geronimo-javamail_1.3.1_spec:pom:)"
RDEPENDS:${PN} += "/bin/sh jaf_1_0_2_api java-headless javapackages-filesystem update-alternatives"

inherit rpm
