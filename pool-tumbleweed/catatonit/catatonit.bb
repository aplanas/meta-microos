SUMMARY = "A signal-forwarding process manager for containers"
DESCRIPTION = "Catatonit is a /sbin/init program for use within containers. It \
forwards (almost) all signals to the spawned child, tears down \
the container when the spawned child exits, and otherwise \
cleans up other exited processes (zombies). \
 \
This is a reimplementation of other container init programs (such as \
'tini' or 'dumb-init'), but uses modern Linux facilities (such as \
signalfd(2)) and has no additional features."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.7"

RPM_NAME = "catatonit-0.1.7-1.8.aarch64.rpm"
RPM_HASH = "16facd2ad1fc8a2cd5cb94d81e77fa417de0b7f909e58ca92de99c88ced00a3eadfdbdd127bfa4aa1397089de88812658a2034fe7809a43bd9406ebf86b0a6f5"

RPROVIDES:${PN} += "catatonit"

RDEPENDS:${PN} += ""

inherit rpm
