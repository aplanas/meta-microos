SUMMARY = "Apache Commons Validator"
DESCRIPTION = "A common issue when receiving data either electronically or from user \
input is verifying the integrity of the data. This work is repetitive \
and becomes even more complicated when different sets of validation \
rules need to be applied to the same set of data based, for example, on \
locale. Error messages may also vary by locale. This package attempts \
to address some of these issues and speed development and maintenance \
of validation rules."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "apache-commons-validator-1.5.0-3.5.noarch.rpm"
RPM_HASH = "28a1b2166f222fd105e91bbb2cd9e2460f07ff13ce079b4264a80b94d3140778f47be6bf7a4b908a40928f5a768585166b187361eab71e035a790858721d83b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-validator \
commons-validator \
jakarta-commons-validator \
mvn-commons-validator-commons-validator \
mvn-commons-validator-commons-validator-pom- \
mvn-org.apache.commons-commons-validator \
mvn-org.apache.commons-commons-validator-pom-"

RDEPENDS:${PN} += "commons-beanutils \
commons-collections \
commons-digester \
commons-logging \
java-headless \
javapackages-filesystem \
mvn-commons-beanutils-commons-beanutils \
mvn-commons-collections-commons-collections \
mvn-commons-digester-commons-digester \
mvn-commons-logging-commons-logging \
oro"

inherit rpm
