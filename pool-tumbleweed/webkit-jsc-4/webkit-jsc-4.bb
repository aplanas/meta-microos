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

PV = "2.40.2"

RPM_NAME = "webkit-jsc-4-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "fff4d5e9b87195778212fd4f300c6702826f2932fcd4e4e90ffec05192c8f5131112b73112ff61fc522a868fa4dec6169b72f09823b58d1b407ce267aa2f768f"

RPROVIDES:${PN} += "webkit-jsc-4 \
webkit-jsc-4(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjavascriptcoregtk-4.0.so.18()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
