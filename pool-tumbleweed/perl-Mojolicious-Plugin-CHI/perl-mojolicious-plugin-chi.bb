SUMMARY = "Use CHI Caches in Mojolicious"
DESCRIPTION = "Mojolicious::Plugin::CHI is a simple plugin to work with CHI caches within \
Mojolicious."
LICENSE = "Artistic-2.0"

PV = "0.20"

RPM_NAME = "perl-Mojolicious-Plugin-CHI-0.20-1.19.noarch.rpm"
RPM_HASH = "bf9d3e4f454e9dfb906cb0f92adc3eb38944221e2fcc3c5a411c80b99520b4663d104f164c125acd3ea3692893dfc997a2e8d32c5af606eb576cf1f8bcdfad38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Mojolicious--Plugin--CHI \
perl-Mojolicious--Plugin--CHI--chi \
perl-Mojolicious-Plugin-CHI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-CHI \
perl-Digest--JHash \
perl-Mojolicious"

inherit rpm
