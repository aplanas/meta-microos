SUMMARY = "Plack::Middleware which sets body for redirect response, if it's not alr[cut]"
DESCRIPTION = "This module sets body in redirect response, if it's not already set."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.12"

RPM_NAME = "perl-Plack-Middleware-FixMissingBodyInRedirect-0.12-1.14.noarch.rpm"
RPM_HASH = "1b27905f4bc2b1af935a05dd9722728a16ae3a6a6f995c74b5746e9c432f366fa6e9cbc343260d5ec8bb33dca00885c2c7c525017abb117d7a2024083ffb3b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Plack--Middleware--FixMissingBodyInRedirect \
perl-Plack-Middleware-FixMissingBodyInRedirect"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Entities \
perl-Plack--Middleware \
perl-Plack--Util \
perl-parent"

inherit rpm
