SUMMARY = "Perl bindings for hivex"
DESCRIPTION = "This subpackage contains the Perl bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "perl-Win-Hivex-1.3.23-2.5.aarch64.rpm"
RPM_HASH = "fad0a670be7074a4928a276e1120acd6b9ef1370422f039ae2eec079cd363757de86937d531a6a7127751455fc3cba5075d26bb01ad2cfffeb31e656ce0f14cf"

RPROVIDES:${PN} += "perl-Win--Hivex \
perl-Win--Hivex--Regedit \
perl-Win-Hivex"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
perl \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
