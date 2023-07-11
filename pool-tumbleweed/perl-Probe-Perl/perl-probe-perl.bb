SUMMARY = "Information about the currently running perl"
DESCRIPTION = "This module provides methods for obtaining information about the currently \
running perl interpreter. It originally began life as code in the \
'Module::Build' project, but has been externalized here for general use."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Probe-Perl-0.03-3.27.noarch.rpm"
RPM_HASH = "e4cb573d66bb76f31f478244ad420d1f8ababf20556e8356584c7635433be0a67dd63a84104fd194bd7371a930b87e007284859f4f742bd254410e3650ee4ec8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Probe--Perl \
perl-Probe-Perl"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
