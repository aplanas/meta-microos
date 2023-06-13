SUMMARY = "Routines for manipulating stashes"
DESCRIPTION = "Manipulating stashes (Perl's symbol tables) is occasionally necessary, but \
incredibly messy, and easy to get wrong. This module hides all of that \
behind a simple API. \
 \
NOTE: Most methods in this class require a variable specification that \
includes a sigil. If this sigil is absent, it is assumed to represent the \
IO slot. \
 \
Due to limitations in the typeglob API available to perl code, and to \
typeglob manipulation in perl being quite slow, this module provides two \
implementations - one in pure perl, and one using XS. The XS implementation \
is to be preferred for most usages; the pure perl one is provided for cases \
where XS modules are not a possibility. The current implementation in use \
can be set by setting '$ENV{PACKAGE_STASH_IMPLEMENTATION}' or \
'$Package::Stash::IMPLEMENTATION' before loading Package::Stash (with the \
environment variable taking precedence), otherwise, it will use the XS \
implementation if possible, falling back to the pure perl one."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40"

RPM_NAME = "perl-Package-Stash-0.40-1.7.noarch.rpm"
RPM_HASH = "1f20e9ff82fa2e68e9cf527963d706b1843c57b127430c37a000f0e5422cf6f9a53dfb08c76305858af3fb906283cc5da3b7ed89a7978602d7d05a43a7fc77d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Package::Stash) \
perl(Package::Stash::PP) \
perl-Package-Stash"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Dist::CheckConflicts) \
perl(Module::Implementation) \
perl(Package::Stash::XS)"

inherit rpm
