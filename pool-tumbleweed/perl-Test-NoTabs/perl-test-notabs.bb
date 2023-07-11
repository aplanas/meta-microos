SUMMARY = "Check the presence of tabs in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of tabs."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-NoTabs-2.02-1.18.noarch.rpm"
RPM_HASH = "ffebc62bea6c6a74975beae3b41ad9266097eb1fae5d383b3e4c8dde9de4527a2ff52a81a28de3bb13de1ecb55c913211fe0092f9af8f4ae2cdc3713830b27d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--NoTabs \
perl-Test-NoTabs"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
