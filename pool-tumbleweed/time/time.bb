SUMMARY = "Run Programs And Summarize System Resource Usage"
DESCRIPTION = "The 'time' command runs another program, then displays information \
about the resources used by that program, collected by the system \
while the program was running."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "time-1.9-3.1.aarch64.rpm"
RPM_HASH = "58ffcc9ec67877025ea6de38f8a397531a11224bc3a8c2c2aaa911f4cae1aaf952bd91bcf28390d35b3b84913dcba1f81e40f0a36be8302a3e55aabe341841da"

RPROVIDES:${PN} += "time"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
