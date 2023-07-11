SUMMARY = "JSR-310 - Date and Time API"
DESCRIPTION = "A date and time API for Java."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.6.4"

RPM_NAME = "time-api-0.6.4-3.20.noarch.rpm"
RPM_HASH = "210d072b2fffee72817f66e3ce1006e21fe1066704bdd5907b567970c753dc3568e4c79538bae1088dbcb134ac4d8417375acb4f77a89923f1cf12ecb16fb0e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-javax.time-time-api \
mvn-javax.time-time-api-pom- \
time-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
