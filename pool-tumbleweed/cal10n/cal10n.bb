SUMMARY = "Compiler assisted localization library (CAL10N)"
DESCRIPTION = "Compiler Assisted Localization, abbreviated as CAL10N (pronounced as 'calion') \
is a java library for writing localized (internationalized) messages. \
Features: \
    * java compiler verifies message keys used in source code \
    * tooling to detect errors in message keys \
    * native2ascii tool made superfluous, as you can directly encode bundles \
      in the most convenient charset, per locale. \
    * good performance (300 nanoseconds per key look-up) \
    * automatic reloading of resource bundles upon change"
LICENSE = "MIT"

PV = "0.8.1.10"

RPM_NAME = "cal10n-0.8.1.10-1.5.noarch.rpm"
RPM_HASH = "f72525fb17cfcde9e7ba176283663e118f1ba14410c7572f3d0ad6b83126888df6edd9c84205d492c0d8161c364f5d46e93ef809b7c915a741150e262f6632ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cal10n \
mvn-ch.qos.cal10n-cal10n-ant-task \
mvn-ch.qos.cal10n-cal10n-ant-task-pom- \
mvn-ch.qos.cal10n-cal10n-api \
mvn-ch.qos.cal10n-cal10n-api-pom- \
mvn-ch.qos.cal10n-cal10n-parent-pom- \
osgi-cal10n.api"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm
