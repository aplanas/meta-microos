SUMMARY = "Test fallback behaviour in absence of modules"
DESCRIPTION = "This module allows you to deliberately hide modules from a program even \
though they are installed. This is mostly useful for testing modules that \
have a fallback when a certain dependency module is not installed."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-Test-Without-Module-0.21-1.4.noarch.rpm"
RPM_HASH = "c9ec84f9d865beb641a67def0d4af0d5b9fae8ba4c52c2cf05f2df2442030b6380c58c45f9e39716e2dca024b4e7d7c0c15938920c3fed4d36ceeec4a9e45368"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--Without--Module \
perl-Test-Without-Module"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
