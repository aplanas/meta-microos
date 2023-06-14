SUMMARY = "Data tables useful in parsing HTML"
DESCRIPTION = "This module contains several data tables useful in various kinds of HTML \
parsing operations. \
 \
Note that all tag names used are lowercase. \
 \
In the following documentation, a 'hashset' is a hash being used as a set \
-- the hash conveys that its keys are there, and the actual values \
associated with the keys are not significant. (But what values are there, \
are always true.)"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "3.20"

RPM_NAME = "perl-HTML-Tagset-3.20-73.26.noarch.rpm"
RPM_HASH = "679b52e836a49ab0f2a0b408d7b2adbdd0f6da5794c2cc39eed4cb5944375803d63faa74a83c13e6c285793b462a4cda99a6058e99f4585ad8b53e98cc0dfbc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Tagset \
perl-HTML-Tagset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
