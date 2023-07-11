SUMMARY = "SASLprep for ongres-stringprep"
DESCRIPTION = "SaslPrep is a profile of stringprep for user names and passwords (saslprep, RFC 4013)."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-saslprep-1.1-1.11.noarch.rpm"
RPM_HASH = "8334fd85fe20a1f46b83d1276361cda1d2363fffaa9030101654eab426f5e353513f2cf420fbca51e973aeb71ab0c3ee58688f8ea1c548d29f5c768ed8909157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.stringprep-saslprep \
mvn-com.ongres.stringprep-saslprep-pom- \
ongres-stringprep-saslprep"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ongres.stringprep-stringprep"

inherit rpm
