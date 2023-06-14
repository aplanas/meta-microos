SUMMARY = "ROOT and examples web applications for Apache Tomcat"
DESCRIPTION = "The ROOT and examples web applications for Apache Tomcat"
LICENSE = "Apache-2.0"

PV = "9.0.75"

RPM_NAME = "tomcat-webapps-9.0.75-1.1.noarch.rpm"
RPM_HASH = "de17747fe008b807aa7398b809e771ae752e71adcecc6a0f4baf5135b2e28efd2d99c43038607739861e0d799811adda8760c3198f7cd878c6eaa88754379415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat-webapps \
tomcat-webapps"

RDEPENDS:${PN} += "/bin/sh \
jakarta-taglibs-standard \
tomcat"

inherit rpm
