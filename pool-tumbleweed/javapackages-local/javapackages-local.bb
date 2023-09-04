SUMMARY = "Non-essential macros and scripts for Java packaging support"
DESCRIPTION = "This package provides non-essential macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-local-6.1.0-4.1.noarch.rpm"
RPM_HASH = "da65e8b68edc640874c64b5fa3788055ca593c7be1b2e339668b89a0ada4ec1777a7c5cfac89450e99a9dedbed9b7a92e681f9460048146c0ba0721dae5329cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-javapackages-local \
javapackages-local \
rpm-macro-add-maven-depmap \
rpm-macro-gradle-build \
rpm-macro-java-remove-annotations \
rpm-macro-java-remove-imports \
rpm-macro-javadoc-package \
rpm-macro-mvn-alias \
rpm-macro-mvn-artifact \
rpm-macro-mvn-build \
rpm-macro-mvn-compat-version \
rpm-macro-mvn-config \
rpm-macro-mvn-file \
rpm-macro-mvn-install \
rpm-macro-mvn-install-pom \
rpm-macro-mvn-package \
rpm-macro-mvn-subst \
rpm-macro-pom-add-dep \
rpm-macro-pom-add-dep-mgmt \
rpm-macro-pom-add-parent \
rpm-macro-pom-add-plugin \
rpm-macro-pom-change-dep \
rpm-macro-pom-disable-module \
rpm-macro-pom-remove-dep \
rpm-macro-pom-remove-parent \
rpm-macro-pom-remove-plugin \
rpm-macro-pom-set-parent \
rpm-macro-pom-xpath-disable \
rpm-macro-pom-xpath-inject \
rpm-macro-pom-xpath-remove \
rpm-macro-pom-xpath-replace \
rpm-macro-pom-xpath-set"

RDEPENDS:${PN} += "java-devel \
javapackages-tools \
python3-javapackages"

inherit rpm
