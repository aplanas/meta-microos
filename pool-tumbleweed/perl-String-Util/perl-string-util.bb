SUMMARY = "String processing utility functions"
DESCRIPTION = "*String::Util* provides a collection of small, handy functions for \
processing strings in various ways."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.34"

RPM_NAME = "perl-String-Util-1.34-1.1.noarch.rpm"
RPM_HASH = "8f07a52c567c948f97b4a6d9c51a6ded15ebb596597363d7958ee8448300cb4da48a3c4158b587354191ab230eac50bf826149e559e69359daacac0ba4cfb2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(String::Util) \
perl-String-Util"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
