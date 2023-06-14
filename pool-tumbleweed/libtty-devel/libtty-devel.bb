SUMMARY = "Library for Terminal Handling"
DESCRIPTION = "This contain the developpment library for handling terminals \
of termrec."
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "libtty-devel-0.19-1.13.aarch64.rpm"
RPM_HASH = "e274d6ac33d8439c639800a7a8d14cab4b298aef2b2e737e8e6d8af2142839baa726649bc2857fed7c01b94b684a7cd62937d9a68c844fd92b8ec9792b3aced0"

RPROVIDES:${PN} += "libtty-devel"

RDEPENDS:${PN} += "libtty1"

inherit rpm
