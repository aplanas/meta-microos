SUMMARY = "Execute code after a scope finished compilation"
DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-B-Hooks-EndOfScope-0.26-1.7.noarch.rpm"
RPM_HASH = "e12dbb3b8ab6319ab3a1cf5d90479561b236cd6b92339c1ee9a751d3690bad689d30ba831a89141ea73cb1cd054f3dfc4f60c36b1da5ff4f4f929545f780f77b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Hooks--EndOfScope \
perl-B--Hooks--EndOfScope--PP \
perl-B--Hooks--EndOfScope--XS \
perl-B-Hooks-EndOfScope"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Hash--Util--FieldHash \
perl-Module--Implementation \
perl-Sub--Exporter--Progressive \
perl-Variable--Magic"

inherit rpm
