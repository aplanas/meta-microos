SUMMARY = "Allows your classes to do coercion of parameters"
DESCRIPTION = "A big part of good API design is that we should be able to be flexible in \
the ways that we take parameters. \
 \
Params::Coerce attempts to encourage this, by making it easier to take a \
variety of different arguments, while adding negligible additional \
complexity to your code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.15"

RPM_NAME = "perl-Params-Coerce-0.15-1.12.noarch.rpm"
RPM_HASH = "b340f415300abb27657b293c4497627d9dba97e85186723c491d8280bddaa36c863a45a7560666761780e846ac3304de98679f30a5c3fbba689047c4c54927fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Params--Coerce \
perl-Params-Coerce"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Params--Util"

inherit rpm
