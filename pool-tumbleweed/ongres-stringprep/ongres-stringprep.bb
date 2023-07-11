SUMMARY = "Preparation of internationalized strings"
DESCRIPTION = "StringPrep is the preparation of internationalized strings (stringprep, RFC 3454)."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "ongres-stringprep-1.1-1.11.noarch.rpm"
RPM_HASH = "056b02422498ea1f5096d5493e64348f59a8195e62193a9aa1701266f5cd0d6af74db48862fb199f5165336a2ff89f9f134dc95e748a9ec27e6c26769992d5c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.stringprep-stringprep \
mvn-com.ongres.stringprep-stringprep-pom- \
ongres-stringprep"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
