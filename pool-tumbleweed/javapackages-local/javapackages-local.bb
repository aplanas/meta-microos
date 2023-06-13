SUMMARY = "Non-essential macros and scripts for Java packaging support"
DESCRIPTION = "This package provides non-essential macros and scripts to support Java packaging."
LICENSE = "BSD-3-Clause"

PV = "6.1.0"

RPM_NAME = "javapackages-local-6.1.0-3.1.noarch.rpm"
RPM_HASH = "6ed6101304366ca9bd2f71a7387219e80aea6047aba89645f424b3856c06f462929ac33b58cafb74698ab83213803dff7fa2ebf957806e54e212f50446d33354"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(javapackages-local) \
javapackages-local \
rpm_macro(add_maven_depmap) \
rpm_macro(gradle_build) \
rpm_macro(java_remove_annotations) \
rpm_macro(java_remove_imports) \
rpm_macro(javadoc_package) \
rpm_macro(mvn_alias) \
rpm_macro(mvn_artifact) \
rpm_macro(mvn_build) \
rpm_macro(mvn_compat_version) \
rpm_macro(mvn_config) \
rpm_macro(mvn_file) \
rpm_macro(mvn_install) \
rpm_macro(mvn_install_pom) \
rpm_macro(mvn_package) \
rpm_macro(mvn_subst) \
rpm_macro(pom_add_dep) \
rpm_macro(pom_add_dep_mgmt) \
rpm_macro(pom_add_parent) \
rpm_macro(pom_add_plugin) \
rpm_macro(pom_change_dep) \
rpm_macro(pom_disable_module) \
rpm_macro(pom_remove_dep) \
rpm_macro(pom_remove_parent) \
rpm_macro(pom_remove_plugin) \
rpm_macro(pom_set_parent) \
rpm_macro(pom_xpath_disable) \
rpm_macro(pom_xpath_inject) \
rpm_macro(pom_xpath_remove) \
rpm_macro(pom_xpath_replace) \
rpm_macro(pom_xpath_set)"

RDEPENDS:${PN} += "java-devel \
javapackages-tools \
python3-javapackages"

inherit rpm
