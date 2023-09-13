SUMMARY = "Non-essential macros and scripts for Java packaging support"
DESCRIPTION = "This package provides non-essential macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.2.0"

RPM_NAME = "javapackages-local-6.2.0-2.1.noarch.rpm"
RPM_HASH = "c40a9bd2e8b8320c32178289522d29adca5f2e5d4236f8eeefb93d1364f3821a0c67881ce0d8c7ab9196f78f6867c452261634e56d1afd1af27b9308aef58364"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-javapackages-local \
javapackages-local \
rpm-macro-add-maven-depmap \
rpm-macro-gradle-build \
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
