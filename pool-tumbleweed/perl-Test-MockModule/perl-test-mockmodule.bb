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

RPM_NAME = "perl-Test-MockModule-0.177.0-1.9.noarch.rpm"
RPM_HASH = "1d7220926087c5e5d8fd997f89846fe581ae557c5b9004d80dba1e398080796a44a168226aea57e1c457b430da8da972b24bdc3df5c8b5f9a8e4cb199f78b86e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockModule \
perl-Test-MockModule"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-SUPER"

inherit rpm
