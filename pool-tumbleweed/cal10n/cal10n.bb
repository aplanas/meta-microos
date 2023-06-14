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

RPM_NAME = "cal10n-0.8.1.10-1.4.noarch.rpm"
RPM_HASH = "f7f98a0b2855d13a88524d5656eb4c0d772cfa30241ac4d362d454314884e98a698453b121151530aee2e2c84a5fb3a1e72dd870108571780a958120450b8a43"
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
