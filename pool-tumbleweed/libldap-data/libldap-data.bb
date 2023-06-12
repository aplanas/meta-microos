SUMMARY = "Configuration file for system-wide defaults for all uses of libldap"
DESCRIPTION = "The subpackage contains a configuration file used to set system-wide defaults \
to be applied with all usages of libldap."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldap-data-2.6.4-1.1.noarch.rpm"
RPM_HASH = "01f1d1e50bf133584a165f0abe2fc74fdec1c2541eb5caddee69f0b9598c0e2b8abcb3317af1e626c45972c8f97dea40378fef06ae052f93dbe1ce618cafbdd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(libldap-data) \
libldap-data"
RDEPENDS:${PN} += ""

inherit rpm
