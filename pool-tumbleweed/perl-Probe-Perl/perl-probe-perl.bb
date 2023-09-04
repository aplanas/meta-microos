SUMMARY = "Information about the currently running perl"
DESCRIPTION = "This module provides methods for obtaining information about the currently \
running perl interpreter. It originally began life as code in the \
'Module::Build' project, but has been externalized here for general use."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Probe-Perl-0.03-3.28.noarch.rpm"
RPM_HASH = "72e433e92d15467c49649ebafe052ef9c48aba34d4fbe1e93e880e96f47dbb66fa52ed976b2c4779a845f7ca66a6080faa86b35c0ff0e0380d17d65e88389bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Probe--Perl \
perl-Probe-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
