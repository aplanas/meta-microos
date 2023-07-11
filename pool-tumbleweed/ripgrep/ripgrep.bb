SUMMARY = "A search tool that combines ag with grep"
DESCRIPTION = "ripgrep is a line oriented search tool that combines the usability of \
The Silver Searcher (similar to ack) with the raw speed of GNU grep. \
ripgrep works by recursively searching your current directory \
for a regex pattern."
LICENSE = "MIT & Unlicense"

PV = "13.0.0"

RPM_NAME = "ripgrep-13.0.0-5.4.aarch64.rpm"
RPM_HASH = "0e1e93349ff0130049ff212e0ab80aebd9b79cf3f2ccb4a5f8115d830609dec8760a753709dc8cd91e2c1073d66e12b02ee9ac1bd1c447be795555d5979d55a1"

RPROVIDES:${PN} += "ripgrep"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
