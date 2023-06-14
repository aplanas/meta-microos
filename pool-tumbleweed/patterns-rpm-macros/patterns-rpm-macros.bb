SUMMARY = "RPM macros for building of patterns modules"
DESCRIPTION = "This package contains SUSE RPM macros to aid creating patterns."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "patterns-rpm-macros-1.0-8.6.noarch.rpm"
RPM_HASH = "e7f45c13963a45eea8a92d60f85aec885a811d7b1dff203c680543d8a699a6852c34c621d86cb156388cddb742796e0f5ec076d158aff48aba8b4b0555f5d93c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patterns-rpm-macros \
rpm-macro-obsolete-legacy-pattern \
rpm-macro-pattern-additionalsoftware \
rpm-macro-pattern-advsysmgmt \
rpm-macro-pattern-basetechnologies \
rpm-macro-pattern-budgiedesktop \
rpm-macro-pattern-deepindesktop \
rpm-macro-pattern-desktopfunctions \
rpm-macro-pattern-desktops \
rpm-macro-pattern-development \
rpm-macro-pattern-documentation \
rpm-macro-pattern-gnomedesktop \
rpm-macro-pattern-graphicalenvironments \
rpm-macro-pattern-kdedesktop \
rpm-macro-pattern-lxdedesktop \
rpm-macro-pattern-matedesktop \
rpm-macro-pattern-pantheondesktop \
rpm-macro-pattern-primaryfunctions \
rpm-macro-pattern-proprietarysoftware \
rpm-macro-pattern-publicclouds \
rpm-macro-pattern-serverfunctions \
rpm-macro-pattern-xfcedesktop"

RDEPENDS:${PN} += ""

inherit rpm
