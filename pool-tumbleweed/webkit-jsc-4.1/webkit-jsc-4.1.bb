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

RPM_NAME = "webkit-jsc-4.1-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "34f7539e92830d1ae4e8f39fff6c45ecf70316ef6c40b8a57100bd53e709491984440adb6f316c31b499fd82b1565c0cc94091d6e45e6e977f9018f40e6b6d98"

RPROVIDES:${PN} += "webkit-jsc-4.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.1.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
