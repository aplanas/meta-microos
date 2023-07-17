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

RPM_NAME = "webkit-jsc-6.0-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "696ad9ec7580b8b0abc3ea5e4f455f1dde8b26243796f31153fe4c47da0a6ebef7d2f99e63f18129ffe47d19460b11f26699f356746834c9a75de05bc6c233e4"

RPROVIDES:${PN} += "webkit-jsc-6.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-6.0.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
