SUMMARY = "Allows you to access the internet through a HTTP proxy"
DESCRIPTION = "TransConnect is a program to allow you almost complete access to the \
internet through a HTTP proxy like squid."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "transconnect-1.2-419.23.aarch64.rpm"
RPM_HASH = "07046cbcd8e3dd5f81c5d29b02699ffa4e26f535cc7f217ebcf52d7095f431f6c3c5f9eb05ba8702b5765866e6b3346c79785e4cb075a907941861a872643475"

RPROVIDES:${PN} += "transconnect \
transconnect(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit)"

inherit rpm
