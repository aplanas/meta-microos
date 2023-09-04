SUMMARY = "Embedded Perl for Apache - Development package"
DESCRIPTION = "The Apache/Perl integration project brings together the full power of \
the Perl programming language and the Apache HTTP server. \
 \
This package contains the include files useful for developing new \
software depending on apache2-mod_perl."
LICENSE = "Apache-2.0"

PV = "2.0.12"

RPM_NAME = "apache2-mod_perl-devel-2.0.12-2.1.aarch64.rpm"
RPM_HASH = "db9847a94e6f06ebe0475beb5c03e6b8a6579f207839ce41dd266618de069e504729cd3dff22e29df09167af0a6f4e60c3d3b503400b724abc5a0c39b24efc97"

RPROVIDES:${PN} += "apache2-mod-perl-devel"

RDEPENDS:${PN} += "apache2-mod-perl"

inherit rpm
