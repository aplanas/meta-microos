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

RPM_NAME = "webkit-jsc-4-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "8384121bee3273e2db4f4ebb6b244ead94e14dada461ed171b7f0d4b0363758e5c0914fa1fecd18b6e9b4a54af6736c024a31d1bbc0bf734211cd030c05c28b6"

RPROVIDES:${PN} += "webkit-jsc-4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.0.so.18 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
