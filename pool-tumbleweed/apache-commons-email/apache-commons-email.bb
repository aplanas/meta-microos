SUMMARY = "Apache Commons Email Package"
DESCRIPTION = "Commons-Email aims to provide an API for sending email. It is built on top of \
the JavaMail API, which it aims to simplify."
LICENSE = "Apache-2.0"

PV = "1.5"

RPM_NAME = "apache-commons-email-1.5-5.7.noarch.rpm"
RPM_HASH = "04620e7a898bce46d0df5a15676abea7b74e83d665aa1b36ef21600a5eb52b7adb2ae5ea751a7426323e3c6f51e8f2562db5198afeb529f7292c868c93ca73fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-email"

RDEPENDS:${PN} += "java \
javamail"

inherit rpm
