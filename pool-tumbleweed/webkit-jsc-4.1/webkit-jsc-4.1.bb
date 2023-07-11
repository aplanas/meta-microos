SUMMARY = "JavaScript command line from WebKit"
DESCRIPTION = "jsc is a command-line utility that allows you to run JavaScript \
programs outside of the context of a web browser. It is primarily \
used as part of the test harness for validating the JavaScript \
portions of WebKit, but can also be used as a scripting tool. \
 \
jsc can be run in an interactive mode to test out JavaScript \
expressions, or it can be passed one or more files to run similar to \
invoking a Perl or Python script."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit-jsc-4.1-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "7b15564eb417d149dfa8f34d0e2a1210a4f560ca0d804fb4b77c6f9fc60421a263a534c5c2265a1a91a6b901411f865f0b73b898c61e8d378ba13c9963855f18"

RPROVIDES:${PN} += "webkit-jsc-4.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.1.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
