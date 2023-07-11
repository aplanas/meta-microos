SUMMARY = "Allows your classes to do coercion of parameters"
DESCRIPTION = "A big part of good API design is that we should be able to be flexible in \
the ways that we take parameters. \
 \
Params::Coerce attempts to encourage this, by making it easier to take a \
variety of different arguments, while adding negligible additional \
complexity to your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Params-Coerce-0.15-1.11.noarch.rpm"
RPM_HASH = "de2627444ab0f50e12afecd1312139ad2cd4d03a2c3ad9a4c763328955df13a79eda902352d6cc1173dc58529f434c98dc07639b34c83cdb6f3a5ab2be6105ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Params--Coerce \
perl-Params-Coerce"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Params--Util"

inherit rpm
