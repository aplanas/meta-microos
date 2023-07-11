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

RPM_NAME = "perl-Regexp-Trie-0.02-1.10.noarch.rpm"
RPM_HASH = "95b99022031347b17b50ff47b35302c00ace74c70cc05e20d14e01021574a2fa6829e1c11551b5184636327185aa53a9b7abfdb2d5edb2fc487909d886db0788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Regexp--Trie \
perl-Regexp-Trie"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
