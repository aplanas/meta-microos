SUMMARY = "RPM macros for building of patterns modules"
DESCRIPTION = "This package contains SUSE RPM macros to aid creating patterns."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "patterns-rpm-macros-1.0-8.6.noarch.rpm"
RPM_HASH = "e7f45c13963a45eea8a92d60f85aec885a811d7b1dff203c680543d8a699a6852c34c621d86cb156388cddb742796e0f5ec076d158aff48aba8b4b0555f5d93c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patterns-rpm-macros \
rpm_macro(obsolete_legacy_pattern) \
rpm_macro(pattern_additionalsoftware) \
rpm_macro(pattern_advsysmgmt) \
rpm_macro(pattern_basetechnologies) \
rpm_macro(pattern_budgiedesktop) \
rpm_macro(pattern_deepindesktop) \
rpm_macro(pattern_desktopfunctions) \
rpm_macro(pattern_desktops) \
rpm_macro(pattern_development) \
rpm_macro(pattern_documentation) \
rpm_macro(pattern_gnomedesktop) \
rpm_macro(pattern_graphicalenvironments) \
rpm_macro(pattern_kdedesktop) \
rpm_macro(pattern_lxdedesktop) \
rpm_macro(pattern_matedesktop) \
rpm_macro(pattern_pantheondesktop) \
rpm_macro(pattern_primaryfunctions) \
rpm_macro(pattern_proprietarysoftware) \
rpm_macro(pattern_publicclouds) \
rpm_macro(pattern_serverfunctions) \
rpm_macro(pattern_xfcedesktop)"
RDEPENDS:${PN} += ""

inherit rpm
