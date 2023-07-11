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

RPM_NAME = "perl-HTML-Tagset-3.20-73.27.noarch.rpm"
RPM_HASH = "ab2b13ed133c3e008f3fc95987669d7a6dab1af32c3609010b16c1ad84920d16139005acf9ef0a7e3a472acf9f3fe3794d0f048eeaf0918716718c31c8119407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTML--Tagset \
perl-HTML-Tagset"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
