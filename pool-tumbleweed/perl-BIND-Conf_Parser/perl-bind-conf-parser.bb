SUMMARY = "Parser class for BIND configuration files"
DESCRIPTION = "This module implements a virtual base class for parsing BIND server \
version 8 configuration files (named.conf)."
LICENSE = "ISC"

PV = "0.97"

RPM_NAME = "perl-BIND-Conf_Parser-0.97-515.29.aarch64.rpm"
RPM_HASH = "062a6a5b08ed309bb30eb5af049081748443c63ada7c0f7c629a120e4f355875a72b91d053b3f8c4102bf15a326f231e1b5efc50e9bdf5b1bf39cabad48da5ba"

RPROVIDES:${PN} += "perl(BIND::Conf_Parser) \
perl-BIND-Conf_Parser \
perl-BIND-Conf_Parser(aarch-64)"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
