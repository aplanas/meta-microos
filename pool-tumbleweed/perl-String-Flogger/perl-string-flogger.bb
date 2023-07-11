SUMMARY = "String munging for loggers"
DESCRIPTION = "string munging for loggers"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.101246"

RPM_NAME = "perl-String-Flogger-1.101246-1.3.noarch.rpm"
RPM_HASH = "20ea210d0cdb375cbcc3ebb897a76c14f04765fe3c973a459ea38286c57113af9dedef8cb289c4e31cca84c342fceb5d2dcd000034fe97fa904c7e4be3d981f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Flogger \
perl-String-Flogger"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-JSON--MaybeXS \
perl-Params--Util \
perl-Sub--Exporter \
perl-Sub--Exporter--Util"

inherit rpm
