SUMMARY = "BSD Sendmail Starttls helper scripts"
DESCRIPTION = "This package includes the directory layout as well as some useful \
helper scripts for better SSL/TLS support. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.2"

RPM_NAME = "sendmail-starttls-8.17.2-1.1.noarch.rpm"
RPM_HASH = "51d732c83557eb2aa780e9daf1fdacaf3020ec160eb91ce466fd23eb0ed2b28a1b45731199cd507bc53a1db868f54f55fb2826cca6bcbb392c6f3003ef060acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sendmail-starttls"

RDEPENDS:${PN} += "cyrus-sasl-saslauthd \
openssl"

inherit rpm
