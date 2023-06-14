SUMMARY = "Pragma to use the C3 method resolution order algorithm"
DESCRIPTION = "This is pragma to change Perl 5's standard method resolution order from \
depth-first left-to-right (a.k.a - pre-order) to the more sophisticated C3 \
method resolution order. \
 \
*NOTE:* YOU SHOULD NOT USE THIS MODULE DIRECTLY - The feature provided is \
integrated into perl version >= 5.9.5, and you should use MRO::Compat \
instead, which will use the core implementation in newer perls, but \
fallback to using this implementation on older perls."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.35"

RPM_NAME = "perl-Class-C3-0.35-1.11.noarch.rpm"
RPM_HASH = "ef3c13d5898253e4630d4926e65c481f70861a9c52b8a65e2770335d51955a5e33d8a698a9d952eeeef14442724a89f994900b39131bd57aed38f979eb2f93ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Class--C3 \
perl-Class-C3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Algorithm--C3"

inherit rpm
