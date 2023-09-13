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

RPM_NAME = "webkit-jsc-4-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "346f6bc7623319d1000fec14d31a07e6c2fbd444d102f4c65aca78d154af2701e86d9098167984fa9627ba4ddc04304988fd6b0cd5efd0b2fcbbcec7fc6177ea"

RPROVIDES:${PN} += "webkit-jsc-4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.0.so.18 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
