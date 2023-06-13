SUMMARY = "Colorizes text using ANSI colors"
DESCRIPTION = "colorizes text using ANSI colors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0.3"

RPM_NAME = "perl-Template-Plugin-Filter-ANSIColor-0.0.3-1.11.noarch.rpm"
RPM_HASH = "3e2ba9bd2bb1a0918e3c0ba486c9ab30a26541da780010625803fd4fe63a0343bdb77be252f82365db93d57a2f6e9d2f48a1ff4cdc4e6fb7ac778f1966d8e8ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Template::Plugin::Filter::ANSIColor) \
perl-Template-Plugin-Filter-ANSIColor"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Template) \
perl(Term::ANSIColor) \
perl(Term::Terminfo)"

inherit rpm
