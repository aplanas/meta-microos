SUMMARY = "Tool for performing actions on an Active Directory domain"
DESCRIPTION = "A command line tool that can perform actions in an Active Directory domain. \
Among other things it can be used to join a computer to a domain."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "adcli-0.9.2-1.3.aarch64.rpm"
RPM_HASH = "200c558b262baa6217df5477b3a22899ba266427cb72ecdef982d3fefe14781c02d7d8da2f214aceceecdde11437e04b4839201c9632405ccce976543f753d74"

RPROVIDES:${PN} += "adcli \
adcli(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libk5crypto.so.3()(64bit) \
libk5crypto.so.3(k5crypto_3_MIT)(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libresolv.so.2()(64bit) \
libresolv.so.2(GLIBC_2.17)(64bit)"

inherit rpm
