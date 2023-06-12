SUMMARY = "Apache Commons Email Package"
DESCRIPTION = "Commons-Email aims to provide an API for sending email. It is built on top of \
the JavaMail API, which it aims to simplify."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "apache-commons-email-1.5-5.6.noarch.rpm"
RPM_HASH = "af0539ddceb5c07d4929c284c64f42367e565e920fa82800babeb566fe1344f6be0424e8ba9c9572e95eeb86ca2a9f20a7860f765d529d13f729a547b9a38d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-email"
RDEPENDS:${PN} += "java \
javamail"

inherit rpm
