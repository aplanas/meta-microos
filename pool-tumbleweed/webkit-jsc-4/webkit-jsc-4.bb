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

RPM_NAME = "webkit-jsc-4-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "490b8a7fe41280b55491d95143a8d47ca863a9cd20ba15a4811dcad2fcb7a97d5a544a35f499f131addda918e9311b63e2c0e1b0b75d20f91f0fe5bcfff8f831"

RPROVIDES:${PN} += "webkit-jsc-4"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.0.so.18 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
