SUMMARY = "User tools for librist"
DESCRIPTION = "This package contains the user tools for the RIST protocol library."
LICENSE = "BSD-2-Clause"

PV = "0.2.7"

RPM_NAME = "rist-tools-0.2.7-2.4.aarch64.rpm"
RPM_HASH = "0bf3b67f437a2fab22caa361abb9c68c2cd5fdcf8f61899cd95fb131e262b4bad18f8db7e3efedd5b68c4fed8a837f06a4fd5ab566f69e9647e1613420af43bf"

RPROVIDES:${PN} += "rist-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librist.so.4"

inherit rpm
