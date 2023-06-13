SUMMARY = "BSD Sendmail Starttls helper scripts"
DESCRIPTION = "This package includes the directory layout as well as some useful \
helper scripts for better SSL/TLS support. \
 \
'sendmail' is a trademark of Sendmail, Inc."
LICENSE = "Sendmail"

PV = "8.17.1"

RPM_NAME = "sendmail-starttls-8.17.1-9.1.noarch.rpm"
RPM_HASH = "37d93aec34bfc96aa375c98c0636e321e3f3d524b1678533ca90a95c3cdee0df0bfa0dc86b96221977e32241e4bf08fca9ccba9e86dfbc6f2190f22b1f23ac35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sendmail-starttls"

RDEPENDS:${PN} += "cyrus-sasl-saslauthd \
openssl"

inherit rpm
