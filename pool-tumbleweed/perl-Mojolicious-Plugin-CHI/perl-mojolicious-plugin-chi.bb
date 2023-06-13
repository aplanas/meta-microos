SUMMARY = "Use CHI Caches in Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::CHI is a simple plugin to work with CHI caches within \
Mojolicious."
LICENSE = "Artistic-2.0"

PV = "0.20"

RPM_NAME = "perl-Mojolicious-Plugin-CHI-0.20-1.17.noarch.rpm"
RPM_HASH = "8a0771aeee942505b2fbe273dcf912683b72b503d30ddbc1380760a2ea238867bb114b94c3296a1cb1cee1a3e50ee93a451bbd5805f90926d8c6c3568969f5a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojolicious::Plugin::CHI) \
perl(Mojolicious::Plugin::CHI::chi) \
perl-Mojolicious-Plugin-CHI"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(CHI) \
perl(Digest::JHash) \
perl(Mojolicious)"

inherit rpm
