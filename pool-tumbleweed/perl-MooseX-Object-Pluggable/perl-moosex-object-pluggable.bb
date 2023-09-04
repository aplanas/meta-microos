SUMMARY = "Make your classes pluggable"
DESCRIPTION = "This module is meant to be loaded as a role from Moose-based classes. It \
will add five methods and four attributes to assist you with the loading \
and handling of plugins and extensions for plugins. I understand that this \
may pollute your namespace, however I took great care in using the least \
ambiguous names possible."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0014"

RPM_NAME = "perl-MooseX-Object-Pluggable-0.0014-1.26.noarch.rpm"
RPM_HASH = "f4e207ee516736aac34f7c0a014e00402f790239cb242b2c1e8909812b54dc9feb6fee984be89ff96c7d5985f1dfe515ea5a04592200dcf83cda4dcdd24a0bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Object--Pluggable \
perl-MooseX-Object-Pluggable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Pluggable--Object \
perl-Module--Runtime \
perl-Moose--Role \
perl-Moose--Util \
perl-Try--Tiny \
perl-namespace--autoclean"

inherit rpm
