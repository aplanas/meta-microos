SUMMARY = "Automated Text File Generator"
DESCRIPTION = "AutoGen is a tool designed for generating program files that contain \
repetitive text with varied substitutions.  Its goal is to simplify the \
maintenance of programs that contain large amounts of repetitious text. \
This is especially valuable if there are several blocks of such text that \
must be kept synchronized in parallel tables."
LICENSE = "GPL-3.0-or-later"

PV = "5.18.16"

RPM_NAME = "autogen-5.18.16-7.7.aarch64.rpm"
RPM_HASH = "55b1520de377a34e61b260a4610b113ed112de27661ea0600b8d1fa69a93690b13dabc532076a605c5e4180a90d8dfa469bb0e6f75773eb5de1919bc3c4bda39"

RPROVIDES:${PN} += "autogen"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
libopts.so.25 \
libxml2.so.2"

inherit rpm
