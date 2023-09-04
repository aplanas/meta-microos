SUMMARY = "Runtime Module Handling"
DESCRIPTION = "The functions exported by this module deal with runtime handling of Perl \
modules, which are normally handled at compile time. This module avoids \
using any other modules, so that it can be used in low-level \
infrastructure. \
 \
The parts of this module that work with module names apply the same syntax \
that is used for barewords in Perl source. In principle this syntax can \
vary between versions of Perl, and this module applies the syntax of the \
Perl on which it is running. In practice the usable syntax hasn't changed \
yet. There's some intent for Unicode module names to be supported in the \
future, but this hasn't yet amounted to any consistent facility. \
 \
The functions of this module whose purpose is to load modules include \
workarounds for three old Perl core bugs regarding 'require'. These \
workarounds are applied on any Perl version where the bugs exist, except \
for a case where one of the bugs cannot be adequately worked around in pure \
Perl."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.016"

RPM_NAME = "perl-Module-Runtime-0.016-1.21.noarch.rpm"
RPM_HASH = "647e301a171622629734deeb7912e7b1404e708dd89b8fc805548fe0137b045757ab6f46abbf96bc30cf1c97d0617da9f92d90a68636a1f031694c9abd6ddd10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Runtime \
perl-Module-Runtime"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
