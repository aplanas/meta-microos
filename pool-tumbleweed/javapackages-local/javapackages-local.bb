SUMMARY = "Non-essential macros and scripts for Java packaging support"
DESCRIPTION = "This package provides non-essential macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-local-6.1.0-3.1.noarch.rpm"
RPM_HASH = "6ed6101304366ca9bd2f71a7387219e80aea6047aba89645f424b3856c06f462929ac33b58cafb74698ab83213803dff7fa2ebf957806e54e212f50446d33354"
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
