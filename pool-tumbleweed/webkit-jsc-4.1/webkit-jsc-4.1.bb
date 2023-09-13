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

RPM_NAME = "webkit-jsc-4.1-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "1c3d83a8263b179e16dfaa91b4862b5e46f632d8466996e9cfdd9cc9a273b0263497352ce79ee9bcd938a3ffecf88f4e369751c2c1a11ec3fe097a1dda601ac9"

RPROVIDES:${PN} += "webkit-jsc-4.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.1.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
