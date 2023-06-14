SUMMARY = "Tool for performing actions on an Active Directory domain"
DESCRIPTION = "A command line tool that can perform actions in an Active Directory domain. \
Among other things it can be used to join a computer to a domain."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "adcli-0.9.2-1.3.aarch64.rpm"
RPM_HASH = "200c558b262baa6217df5477b3a22899ba266427cb72ecdef982d3fefe14781c02d7d8da2f214aceceecdde11437e04b4839201c9632405ccce976543f753d74"

RPROVIDES:${PN} += "adcli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libk5crypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libresolv.so.2"

inherit rpm
