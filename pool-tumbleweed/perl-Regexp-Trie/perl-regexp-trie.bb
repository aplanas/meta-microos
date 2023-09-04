SUMMARY = "Builds trie-ized regexp"
DESCRIPTION = "This module is a faster but simpler version of Regexp::Assemble or \
Regexp::Optimizer. It builds a trie-ized regexp as above. \
 \
This module is faster than Regexp::Assemble but you can only add literals. \
'a+b' is treated as 'a\\+b', not 'more than one a's followed by b'. \
 \
I wrote this module because I needed something faster than Regexp::Assemble \
and Regexp::Optimizer. If you need more minute control, use those instead."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-Regexp-Trie-0.02-1.11.noarch.rpm"
RPM_HASH = "87f3145b8ed9ee9cff38de9d33577baea3dd7b71e48f8b8a8600678577e980c2b7d9312f17910b11af44af45bc799913fe12d0036ee61cf242fd29044b205b0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--Trie \
perl-Regexp-Trie"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
