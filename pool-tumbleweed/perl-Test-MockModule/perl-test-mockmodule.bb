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

RPM_NAME = "perl-Test-MockModule-0.177.0-1.11.noarch.rpm"
RPM_HASH = "cfb7a0b0eb6d0ede100f89beae4c7a48ebd6c79df6126ccc3d22db3ca8e9bf0ffefd8fef165e7e8f71e6067291d063620d0d294af46325fc72e5105e60cb76f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--MockModule \
perl-Test-MockModule"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-SUPER"

inherit rpm
