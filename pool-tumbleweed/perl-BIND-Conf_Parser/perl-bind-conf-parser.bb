SUMMARY = "Parser class for BIND configuration files"
DESCRIPTION = "This module implements a virtual base class for parsing BIND server \
version 8 configuration files (named.conf)."
LICENSE = "ISC"

PV = "0.97"

RPM_NAME = "perl-BIND-Conf_Parser-0.97-515.31.aarch64.rpm"
RPM_HASH = "3a2f0a30e183c554b242dfa3bbc47a1de20fa7239a0432fcb50866f7dc83747cbfe901e80e4b0eb4cf09370b68f46b262300ea49dbc895f092c5284445b96553"

RPROVIDES:${PN} += "perl-BIND--Conf-Parser \
perl-BIND-Conf-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
