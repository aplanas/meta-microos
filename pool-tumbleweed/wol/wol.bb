SUMMARY = "Wake On Lan client"
DESCRIPTION = "The Wake On Lan client wakes up magic packet compliant machines such as \
boxes with wake-on-lan ethernet-cards. Some workstations provide \
SecureON which extends wake-on-lan with a password. This feature is \
also provided by wol."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.1"

RPM_NAME = "wol-0.7.1-162.20.aarch64.rpm"
RPM_HASH = "e02187f01edd3cee5442f9ffe9f5b44704a28402f3ec7f43e41c933a7d8774dd0a161ff4485f6f5d82a03aea77bb78b7c3aa096f50a9a7c691bf3852a07ebfcb"

RPROVIDES:${PN} += "wol"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
