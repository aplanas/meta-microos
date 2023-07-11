SUMMARY = "Add contextual fetches to DBI"
DESCRIPTION = "It always struck me odd that DBI didn't take much advantage of Perl's \
context sensitivity. DBIx::ContextualFetch redefines some of the various \
fetch methods to fix this oversight. It also adds a few new methods for \
convenience (though not necessarily efficiency)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.03"

RPM_NAME = "perl-DBIx-ContextualFetch-1.03-5.27.noarch.rpm"
RPM_HASH = "a022f4fb771574e14398b3523c5610effee4ecc9fb74720c2ad42735bb8c19c943b0d962ee9d5b294460c49ff89ba4c236648e6fe39f92ea2461be02af15dbca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--ContextualFetch \
perl-DBIx--ContextualFetch--db \
perl-DBIx--ContextualFetch--st \
perl-DBIx-ContextualFetch"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DBI"

inherit rpm
