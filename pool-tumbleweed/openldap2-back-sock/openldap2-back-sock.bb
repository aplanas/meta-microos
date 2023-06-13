SUMMARY = "OpenLDAP Socket Back-End"
DESCRIPTION = "The OpenLDAP socket back-end allows you to handle LDAP requests and \
results with an external process listening on a Unix domain socket."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-sock-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "0681f24fb0699ec0c81dcca61d740f756c8a55ad9fd5055076ea5fdbeaade6d69d06e35a1d2e0243238a3ca70970e15fa0645521943b26186eae1ce5de1964c1"

RPROVIDES:${PN} += "openldap2-back-sock \
openldap2-back-sock(aarch-64) \
openldap2:/usr/share/man/man5/slapd-sock.5.gz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
openldap2"

inherit rpm
