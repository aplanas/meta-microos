SUMMARY = "Plack::Middleware which sets body for redirect response, if it's not alr[cut]"
DESCRIPTION = "This module sets body in redirect response, if it's not already set."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.12"

RPM_NAME = "perl-Plack-Middleware-FixMissingBodyInRedirect-0.12-1.13.noarch.rpm"
RPM_HASH = "d45df6686d73bb36fe904564c83787fddef4ae96a9a1269c8d932d62041f61566c69272faed01aa1574364f6686f13139de5f0847cc8ad39ab30ab3d13dbd934"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--FixMissingBodyInRedirect \
perl-Plack-Middleware-FixMissingBodyInRedirect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Entities \
perl-Plack--Middleware \
perl-Plack--Util \
perl-parent"

inherit rpm
