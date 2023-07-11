SUMMARY = "Use CHI Caches in Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::CHI is a simple plugin to work with CHI caches within \
Mojolicious."
LICENSE = "Artistic-2.0"

PV = "0.20"

RPM_NAME = "perl-Mojolicious-Plugin-CHI-0.20-1.18.noarch.rpm"
RPM_HASH = "dda11a817eb52b2520323309f86bba404c5b9f51d3bb3940a0c7d02b0dbf2bbf9c8cc2bdf6cd5cb94ff45e156735618064e67093703b907c11a58d300b4785b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--CHI \
perl-Mojolicious--Plugin--CHI--chi \
perl-Mojolicious-Plugin-CHI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-CHI \
perl-Digest--JHash \
perl-Mojolicious"

inherit rpm
