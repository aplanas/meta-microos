SUMMARY = "Embedded Perl for Apache - Development package"
DESCRIPTION = "The Apache/Perl integration project brings together the full power of \
the Perl programming language and the Apache HTTP server. \
 \
This package contains the include files useful for developing new \
software depending on apache2-mod_perl."
LICENSE = "Apache-2.0"

PV = "2.0.12"

RPM_NAME = "apache2-mod_perl-devel-2.0.12-1.9.aarch64.rpm"
RPM_HASH = "7ca13d5c01b993b2fcdb2885138473ead5ceb00151e50dca807fa576e537099ab3568f06cf512872a36eae3990eafa87c1f0be41581e543cc77bf08ea846766d"

RPROVIDES:${PN} += "apache2-mod-perl-devel"

RDEPENDS:${PN} += "apache2-mod-perl"

inherit rpm
