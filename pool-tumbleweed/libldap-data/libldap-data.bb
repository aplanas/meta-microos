SUMMARY = "Configuration file for system-wide defaults for all uses of libldap"
DESCRIPTION = "The subpackage contains a configuration file used to set system-wide defaults \
to be applied with all usages of libldap."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldap-data-2.6.4-2.2.noarch.rpm"
RPM_HASH = "453dcbf8f6af31fcb063701021ca09780466acd769026f91978756420dc874b81dabc89360a48f890ee73d2562b776efd7639872423d12062a4b4d844d5a01c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-libldap-data \
libldap-data"

RDEPENDS:${PN} += ""

inherit rpm
