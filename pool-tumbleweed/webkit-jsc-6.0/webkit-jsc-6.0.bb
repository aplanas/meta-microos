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

RPM_NAME = "webkit-jsc-6.0-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "2a481bfba8ba2e13b41cd352c43cbf593630b22e0816ec7c9c81782a0db1481c36c28af333954da1e36dc14c7ece6bbad734e247a8d3c974851eb42eb3a8322f"

RPROVIDES:${PN} += "webkit-jsc-6.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-6.0.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
