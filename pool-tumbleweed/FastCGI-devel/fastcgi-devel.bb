SUMMARY = "A scalable, open extension to CGI"
DESCRIPTION = "FastCGI is a language independent, scalable, open extension to CGI that \
provides high performance without the limitations of server specific \
APIs."
LICENSE = "OML"

PV = "2.4.0"

RPM_NAME = "FastCGI-devel-2.4.0-173.2.aarch64.rpm"
RPM_HASH = "07a565cf9fbe602e21f4ae4206fe1c69909f27d1a5603d6c174ce77d497253d758e8e2239f20e74211f9065d5fbd7ec83ef3400d1ef15258403256f9a998aecb"

RPROVIDES:${PN} += "FastCGI-devel"

RDEPENDS:${PN} += "glibc-devel \
libfcgi0"

inherit rpm
