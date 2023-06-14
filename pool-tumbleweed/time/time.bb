SUMMARY = "Run Programs And Summarize System Resource Usage"
DESCRIPTION = "The 'time' command runs another program, then displays information \
about the resources used by that program, collected by the system \
while the program was running."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "time-1.9-2.5.aarch64.rpm"
RPM_HASH = "d887a52b36524481dee492fa01d5c74aea145aa88f49545f984269de85485a75090da9a541d3ba9932d3943432d519197913be9f6b31c6deeed73ef1e6eab381"

RPROVIDES:${PN} += "time"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
