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

RPM_NAME = "webkit-jsc-6.0-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "b02b097d843e30b708b35988447dce0a9d5f5e0807440a8211e42fb04c9413fae96938cf5d7a3723a71a293f1e05898fc7c982ea3cbe6e804a755120e2639bcb"

RPROVIDES:${PN} += "webkit-jsc-6.0 \
webkit-jsc-6.0(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjavascriptcoregtk-6.0.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit)"

inherit rpm
