SUMMARY = "Git tools for importing CVS repositories"
DESCRIPTION = "Tools for importing CVS repositories to the Git version control system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-cvs-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "4744ac41bdc3732efd35351d24206dcf8ecbf0854f5402402082fe3e22bf94dfd43621fa5b6a2ab171f3699fdf9981b9ef1d027d2faed05fd0d6eca679285b80"

RPROVIDES:${PN} += "git-cvs"

RDEPENDS:${PN} += "/usr/bin/perl \
cvs \
cvsps \
git-core \
perl-DBD-SQLite \
perl-Git"

inherit rpm
