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

PV = "2.40.4"

RPM_NAME = "webkit-jsc-4-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "1e187cf4089dc45662bb5443167badc74dbbc83e74040dd875b40650b4f934aeb2c7c6d256ea7c6f0167c17c7284f0795597292b8a3c6d46ca1b9805afa27728"

RPROVIDES:${PN} += "webkit-jsc-4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.0.so.18 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
