SUMMARY = "Apache configuration for bugzilla"
DESCRIPTION = "This subpackage contains the Apache configuration files"
LICENSE = "MPL-2.0"

PV = "5.0.6"

RPM_NAME = "bugzilla-apache-5.0.6-5.1.noarch.rpm"
RPM_HASH = "6970aeadc8967068dbbde01c1bfcb308f96157fd2c0235158ea19963e93a9a18bc930805dcb6c835ae570c695d6a9349488e92d5aee760ede41f8d2821e2991e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bugzilla-apache \
config(bugzilla-apache)"

RDEPENDS:${PN} += "apache2 \
apache2-mod_perl"

inherit rpm
