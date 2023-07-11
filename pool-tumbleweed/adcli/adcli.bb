SUMMARY = "Tool for performing actions on an Active Directory domain"
DESCRIPTION = "A command line tool that can perform actions in an Active Directory domain. \
Among other things it can be used to join a computer to a domain."
LICENSE = "LGPL-2.0-or-later"

PV = "0.9.2"

RPM_NAME = "adcli-0.9.2-1.4.aarch64.rpm"
RPM_HASH = "87f92e4a9b87b2ae78e5e9a47aaf99004cd9c7906ffe43a6cfc70db3561040de4efe9a9ab5a54dc190bf15c7e1869d9de7611b2784a7199c2ec539c9384114bc"

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
