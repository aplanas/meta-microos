SUMMARY = "Utilities to write and check a MANIFEST file"
DESCRIPTION = "..."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.75"

RPM_NAME = "perl-ExtUtils-Manifest-1.75-1.1.noarch.rpm"
RPM_HASH = "51d7524028e6bf5ea09b77af1a265abcae3aeec7f0728914c0d892438b8018e464f7595336c41124a5bb16502da5de93b4cf64b18f1a18bf3f79969d47186673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(ExtUtils::Manifest) \
perl-ExtUtils-Manifest"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
