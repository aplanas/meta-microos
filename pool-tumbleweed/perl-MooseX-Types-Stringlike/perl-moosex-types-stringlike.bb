SUMMARY = "Moose type constraints for strings or string-like objects"
DESCRIPTION = "This module provides a more general version of the 'Str' type. If coercions \
are enabled, it will accepts objects that overload stringification and \
coerces them into strings."
LICENSE = "Apache-2.0"

PV = "0.003"

RPM_NAME = "perl-MooseX-Types-Stringlike-0.003-3.26.noarch.rpm"
RPM_HASH = "d5e5752c807ff3fb37ebcd81f73c31661c2aca4ab2b0c96a9f71a7eee1b7ecd9f1bbb214884b7b20bc21788a06b15efff5470fc6c83f715e9544d7b0acff30a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Types--Stringlike \
perl-MooseX-Types-Stringlike"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-MooseX--Types \
perl-MooseX--Types--Moose"

inherit rpm
