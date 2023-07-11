SUMMARY = "Execute code after a scope finished compilation"
DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-B-Hooks-EndOfScope-0.26-1.8.noarch.rpm"
RPM_HASH = "e28cc5181f400777699d14c360d83e239ea54fa487a90a35fe2e2b80cd8a452dd18e54c3ce3984ccce3346fddea6aabcb5a55f81a8b283779638dce53cc14827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Hooks--EndOfScope \
perl-B--Hooks--EndOfScope--PP \
perl-B--Hooks--EndOfScope--XS \
perl-B-Hooks-EndOfScope"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Hash--Util--FieldHash \
perl-Module--Implementation \
perl-Sub--Exporter--Progressive \
perl-Variable--Magic"

inherit rpm
