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

RPM_NAME = "perl-Crypt-OpenSSL-Guess-0.15-1.8.noarch.rpm"
RPM_HASH = "6e4e5826abb7dfaa124818266429a35d9ff8f8c90b55c5e9a0fc817706cb45c71986d813191b35278ac276c60e98f7dcee6dd22c194cdab7d3d54d094375cdbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--OpenSSL--Guess \
perl-Crypt-OpenSSL-Guess"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
