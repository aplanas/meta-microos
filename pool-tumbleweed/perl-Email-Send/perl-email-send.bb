SUMMARY = "Simply Sending Email"
DESCRIPTION = "This module provides a very simple, very clean, very specific interface to \
multiple Email mailers. The goal of this software is to be small and \
simple, easy to use, and easy to extend."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "2.201"

RPM_NAME = "perl-Email-Send-2.201-1.22.noarch.rpm"
RPM_HASH = "0bde5f2975601b410797725e9a8fd499e696d5391d4abe6b33e1ebd69b41d2f730421bf731d9831d099f1304ba84eb4d330a32e30080f1edae87283fcabd7a37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Send \
perl-Email--Send--NNTP \
perl-Email--Send--Qmail \
perl-Email--Send--SMTP \
perl-Email--Send--Sendmail \
perl-Email--Send--Test \
perl-Email-Send"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Email--Abstract \
perl-Email--Address \
perl-Email--Simple \
perl-Module--Pluggable \
perl-Return--Value"

inherit rpm
