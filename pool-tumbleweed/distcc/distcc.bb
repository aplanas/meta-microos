SUMMARY = "A distributed C/C++ compiler"
DESCRIPTION = "distcc is a program to distribute builds of C, C++, Objective C or \
Objective C++ code across several machines on a network, thereby \
completing the task in less time. distcc should always generate the \
same results as a local build."
LICENSE = "GPL-2.0-or-later"

PV = "3.4"

RPM_NAME = "distcc-3.4-5.5.aarch64.rpm"
RPM_HASH = "4cae9a22bb6d7061d26fd3f039664a7807759d1d4b51f1afbc97777dae9fef0bbfbb74c5a823bfeaa4580b1212d1b0abea171d8bda8477e147d6316e6d826376"

RPROVIDES:${PN} += "config-distcc \
distcc"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm
