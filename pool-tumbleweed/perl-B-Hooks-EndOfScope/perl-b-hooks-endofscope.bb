SUMMARY = "Execute code after a scope finished compilation"
DESCRIPTION = "This module allows you to execute code when perl finished compiling the \
surrounding scope."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.26"

RPM_NAME = "perl-B-Hooks-EndOfScope-0.26-1.9.noarch.rpm"
RPM_HASH = "d359c41f907d064568f3f79bcbc20dac96dcd4bd78d96ad4d0af9bcc96d2d45f517acdaf472fe02b372d168b25b0207262ab26afc31c39c004715d8bc98f52fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-B--Hooks--EndOfScope \
perl-B--Hooks--EndOfScope--PP \
perl-B--Hooks--EndOfScope--XS \
perl-B-Hooks-EndOfScope"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Hash--Util--FieldHash \
perl-Module--Implementation \
perl-Sub--Exporter--Progressive \
perl-Variable--Magic"

inherit rpm
