SUMMARY = "Create DateTime objects with sub-second current time resolution"
DESCRIPTION = "This module enables you to generate DateTime objects that represent the \
current time with sub-second resolution."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.04"

RPM_NAME = "perl-DateTime-HiRes-0.04-1.1.noarch.rpm"
RPM_HASH = "c5c65ea8f1b3a9e9fe0c79ed7d61853640fd13c4539ba1a86fdac19e68dc916c20d8992212dd908a07553d8b2843501b1f6e0b1cd39337dbf130190d2dc480b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(DateTime::HiRes) \
perl-DateTime-HiRes"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DateTime)"

inherit rpm
