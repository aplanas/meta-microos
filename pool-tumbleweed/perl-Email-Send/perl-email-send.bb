SUMMARY = "Simply Sending Email"
DESCRIPTION = "This module provides a very simple, very clean, very specific interface to \
multiple Email mailers. The goal of this software is to be small and \
simple, easy to use, and easy to extend."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.201"

RPM_NAME = "perl-Email-Send-2.201-1.21.noarch.rpm"
RPM_HASH = "4e4baae541cce8d63ed2112592dd4d3dce57c1d29a2f4264c28b3bce16b300a1bfd32e6f353fd4c97dcf2929ba4bbb7120c694938a50e57bd18bc29588fe5fa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Send \
perl-Email--Send--NNTP \
perl-Email--Send--Qmail \
perl-Email--Send--SMTP \
perl-Email--Send--Sendmail \
perl-Email--Send--Test \
perl-Email-Send"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Email--Abstract \
perl-Email--Address \
perl-Email--Simple \
perl-Module--Pluggable \
perl-Return--Value"

inherit rpm
