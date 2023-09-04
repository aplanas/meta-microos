SUMMARY = "Guess OpenSSL include path"
DESCRIPTION = "Crypt::OpenSSL::Guess provides helpers to guess OpenSSL include path on any \
platforms. \
 \
Often macOS's homebrew OpenSSL cause a problem on installation due to \
include path is not added. Some CPAN module provides to modify include path \
with configure-args, but Carton or Module::CPANfile is not supported to \
pass configure-args to each modules. Crypt::OpenSSL::* modules should use \
it on your Makefile.PL. \
 \
This module resolves the include path by Net::SSLeay's workaround. Original \
code is taken from 'inc/Module/Install/PRIVATE/Net/SSLeay.pm' by \
Net::SSLeay."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Crypt-OpenSSL-Guess-0.15-1.9.noarch.rpm"
RPM_HASH = "1e2e0f44e2f701c206ceb62e636c77e52f41a778435962a0f900cee4d1f4b21c5b1afbfd3c035ee5a86842fb49bad52e7c0a91f771c9f8a5074ce56870b8bd67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Guess \
perl-Crypt-OpenSSL-Guess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
