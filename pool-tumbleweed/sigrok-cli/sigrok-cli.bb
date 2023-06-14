SUMMARY = "Logic Analyzer Command Line Tool"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
sigrok-cli is a command-line tool written in C, which uses both \
libsigrok and libsigrokdecode to provide the basic sigrok \
functionality from the command-line. Among other things, it's useful \
for scripting purposes."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.2"

RPM_NAME = "sigrok-cli-0.7.2-1.10.aarch64.rpm"
RPM_HASH = "fe923f56088ce62d0c4e9b17b33f08ce8eb1d232292aa67fc88306c2191bef21920def95895b5b6b839285718fb8e5704075f05838ec73aa65d9c3372e8e3a7d"

RPROVIDES:${PN} += "sigrok-cli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsigrok.so.4 \
libsigrokdecode.so.4"

inherit rpm
