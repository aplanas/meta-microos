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

PV = "2.40.5"

RPM_NAME = "webkit-jsc-6.0-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "75a6f96f725b11af90b5985b729e638ee61392b4ab0a4b21a7246cfead40de7747fe3be089c4b51362ccb115d0ed907d3c7f965bcba9dfdd83e1e4358938d122"

RPROVIDES:${PN} += "webkit-jsc-6.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-6.0.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
