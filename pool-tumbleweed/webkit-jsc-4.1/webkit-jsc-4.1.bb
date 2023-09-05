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

RPM_NAME = "webkit-jsc-4.1-2.40.5-2.1.aarch64.rpm"
RPM_HASH = "2608976d33c6399fd0571d6435b459b02daedf809a9f9bb9ea09ad2125adeb9e393c8a2c83ad9c6ad94506d33a02e23d0767f23a05333675da9af0ef65c07383"

RPROVIDES:${PN} += "webkit-jsc-4.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjavascriptcoregtk-4.1.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
