SUMMARY = "Advanced Easy-to-Use Asynchronous-Capable DNS Utilities"
DESCRIPTION = "adns includes a collection of useful DNS resolver utilities."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.0"

RPM_NAME = "adns-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "fd92c3b66697b33978107767c178234abc63c1e2d555a300bb2b1e2781b46d4643748f0dd407d1df85bda881677a095a472629d361ed1b7842c163e54354ae6b"

RPROVIDES:${PN} += "adns"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadns.so.1 \
libc.so.6"

inherit rpm
