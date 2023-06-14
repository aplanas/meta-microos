SUMMARY = "Plack::Middleware which sets body for redirect response, if it's not alr[cut]"
DESCRIPTION = "This module sets body in redirect response, if it's not already set."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.12"

RPM_NAME = "perl-Plack-Middleware-FixMissingBodyInRedirect-0.12-1.12.noarch.rpm"
RPM_HASH = "63db3bcbad64d134826e9c6dbb62f1399c79030afc194907469cfc6f7d4e1a4d26b0c52c6f4bb402d295ec75a22d6a6582ac6b0576cfa7faca83020395e4a4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--FixMissingBodyInRedirect \
perl-Plack-Middleware-FixMissingBodyInRedirect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-HTML--Entities \
perl-Plack--Middleware \
perl-Plack--Util \
perl-parent"

inherit rpm
