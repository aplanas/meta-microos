SUMMARY = "Parser class for BIND configuration files"
DESCRIPTION = "This module implements a virtual base class for parsing BIND server \
version 8 configuration files (named.conf)."
LICENSE = "ISC"

PV = "0.97"

RPM_NAME = "perl-BIND-Conf_Parser-0.97-515.30.aarch64.rpm"
RPM_HASH = "b575910524d5b5c830c6c5ac8f75e8cf71916352ebea2f12c31c74dc44aa43619cec171f0448bffdacf27df13b726a5896e8e50363498bab6ba4c722243dd44f"

RPROVIDES:${PN} += "perl-BIND--Conf-Parser \
perl-BIND-Conf-Parser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
