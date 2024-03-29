SUMMARY = "Small tool for prompting users"
DESCRIPTION = "Small tool to ask the user for one or more responses (e.g., from batch \
files). \
 \
 \
 \
Authors: \
-------- \
    Barry Brachman <brachman@cs.ubc.ca>"
LICENSE = "BSD-3-Clause"

PV = "91.9.28"

RPM_NAME = "xprompt-91.9.28-1218.21.aarch64.rpm"
RPM_HASH = "dbb7f31f493f403893db2823e19668c0ef20ff6ec2ee0bcb7f3191a609ea2f81ee71f4f1c1a7aa4ad3ac98f208fb226b2fc1d3e28a54c05375dc81acc4099724"

RPROVIDES:${PN} += "xprompt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
