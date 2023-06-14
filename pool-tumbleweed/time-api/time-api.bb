SUMMARY = "JSR-310 - Date and Time API"
DESCRIPTION = "A date and time API for Java."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & SUSE-Public-Domain"

PV = "0.6.4"

RPM_NAME = "time-api-0.6.4-3.19.noarch.rpm"
RPM_HASH = "d0a2df84be7390d0c064d3c29bf5eccbebb25cad736fce3768c1033834fe6ab8cd14b4dae9a7aa69695512b45657cc7a8763e95430dc309267f42f047b66893c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-javax.time-time-api \
mvn-javax.time-time-api-pom- \
time-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
