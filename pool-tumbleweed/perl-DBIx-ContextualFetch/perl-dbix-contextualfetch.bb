SUMMARY = "Add contextual fetches to DBI"
DESCRIPTION = "It always struck me odd that DBI didn't take much advantage of Perl's \
context sensitivity. DBIx::ContextualFetch redefines some of the various \
fetch methods to fix this oversight. It also adds a few new methods for \
convenience (though not necessarily efficiency)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-DBIx-ContextualFetch-1.03-5.28.noarch.rpm"
RPM_HASH = "c94b648921b3bd6fb8b0c3157c7a9dddcd018aa6f32557f693febcda95ccb9acd806ed57949dfa5ca643611401e5d67219d14259da1a3bafe7bfc1dda607a9d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--ContextualFetch \
perl-DBIx--ContextualFetch--db \
perl-DBIx--ContextualFetch--st \
perl-DBIx-ContextualFetch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DBI"

inherit rpm
