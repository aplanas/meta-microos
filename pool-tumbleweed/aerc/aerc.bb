SUMMARY = "An email client for terminals"
DESCRIPTION = "aerc is an email client that runs in terminals."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "aerc-0.15.2-2.2.aarch64.rpm"
RPM_HASH = "05b6e1d21b4ce759ce64deab88e51081343a17179c0504a1b407d050292a189ce16737e2e33934fa04d422074c9fa59234a59057dc5a842634ea475d8a83c88d"

RPROVIDES:${PN} += "aerc"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/python3 \
/usr/bin/sh \
libc.so.6 \
libnotmuch.so.5"

inherit rpm
