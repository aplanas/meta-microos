SUMMARY = "Make your classes pluggable"
DESCRIPTION = "This module is meant to be loaded as a role from Moose-based classes. It \
will add five methods and four attributes to assist you with the loading \
and handling of plugins and extensions for plugins. I understand that this \
may pollute your namespace, however I took great care in using the least \
ambiguous names possible."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.0014"

RPM_NAME = "perl-MooseX-Object-Pluggable-0.0014-1.25.noarch.rpm"
RPM_HASH = "56a74fe2c753c24a5979bd7e4ba39fd9b256a2d0f2ddfedbd2c21024aa4bc39ccd2d5fafc35f10aad2db66b8e31e372761383578a7aa35e141a0573b346ac9ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Object--Pluggable \
perl-MooseX-Object-Pluggable"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Pluggable--Object \
perl-Module--Runtime \
perl-Moose--Role \
perl-Moose--Util \
perl-Try--Tiny \
perl-namespace--autoclean"

inherit rpm
