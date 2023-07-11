SUMMARY = "Keep imports and functions out of your namespace"
DESCRIPTION = "Keep imports and functions out of your namespace"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-namespace-clean-0.27-1.25.noarch.rpm"
RPM_HASH = "7ce2611181ec8bd5234c920c795c0dc2a26acd77c02f9c2fad0e0cd845a325b920f6bcecd053dfb2e20b3fe693d968fa45285c7f6ffaec2cc0edc91bc0690c53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-namespace--clean \
perl-namespace-clean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-B--Hooks--EndOfScope \
perl-Package--Stash"

inherit rpm
