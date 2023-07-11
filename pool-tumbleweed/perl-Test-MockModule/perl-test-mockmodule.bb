SUMMARY = "Override subroutines in a module for unit testing"
DESCRIPTION = "'Test::MockModule' lets you temporarily redefine subroutines in other \
packages for the purposes of unit testing. \
 \
A 'Test::MockModule' object is set up to mock subroutines for a given \
module. The object remembers the original subroutine so it can be easily \
restored. This happens automatically when all MockModule objects for the \
given module go out of scope, or when you 'unmock()' the subroutine."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.177.0"

RPM_NAME = "perl-Test-MockModule-0.177.0-1.10.noarch.rpm"
RPM_HASH = "1f6945380ed5dbcbac122c5a9448248ee4385f83ee2062802dedde4b61922b7bb3b996bca153f5c9be63f024e1a166ac9664ab2a8348fc58f626ac9b3e79d665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockModule \
perl-Test-MockModule"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-SUPER"

inherit rpm
