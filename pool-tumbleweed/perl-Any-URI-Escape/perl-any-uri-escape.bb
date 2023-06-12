SUMMARY = "Load URI::Escape::XS preferentially over URI::Escape"
DESCRIPTION = "URI::Escape is great, but URI::Escape::XS is faster. This module loads \
URI::Escape::XS and imports the two most common methods if XS is installed. \
 \
The insides of this module aren't completely shaken out yet, so patches \
welcome."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.01"

RPM_NAME = "perl-Any-URI-Escape-0.01-1.12.noarch.rpm"
RPM_HASH = "6e3bec0fbf85d0a46dc18941d560773721bf80b0fcdad296900bca916b022a9553bbd510a15a4db5840ab19fef3a7e6edc90fff35d8e58615f2b651a2fb47954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Any::URI::Escape) \
perl-Any-URI-Escape"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(URI::Escape)"

inherit rpm
