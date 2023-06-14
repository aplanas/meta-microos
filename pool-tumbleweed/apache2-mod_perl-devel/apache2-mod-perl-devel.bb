SUMMARY = "Embedded Perl for Apache - Development package"
DESCRIPTION = "The Apache/Perl integration project brings together the full power of \
the Perl programming language and the Apache HTTP server. \
 \
This package contains the include files useful for developing new \
software depending on apache2-mod_perl."
LICENSE = "Apache-2.0"

PV = "2.0.12"

RPM_NAME = "apache2-mod_perl-devel-2.0.12-1.8.aarch64.rpm"
RPM_HASH = "7af432681e20db52f147eb26f3349af3ab043d8ea9c0c48612855cf9fd4f0338a124cb641679dbc6240ac6a659dd98acf36390069b6981d17b233be3e2baf3d0"

RPROVIDES:${PN} += "apache2-mod-perl-devel"

RDEPENDS:${PN} += "apache2-mod-perl"

inherit rpm
