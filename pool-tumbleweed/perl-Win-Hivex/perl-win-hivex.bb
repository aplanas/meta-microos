SUMMARY = "Perl bindings for hivex"
DESCRIPTION = "This subpackage contains the Perl bindings for hivex. \
Hivex is a Windows Registry Hive extraction library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "perl-Win-Hivex-1.3.23-2.3.aarch64.rpm"
RPM_HASH = "2bfcf11cffdb1e633aea73275edbbfba558afd1ea548740401c8480c0a642b48d8d52393ef3e1f48ffd2e1d70ce00da98820b852d464be1b0d2f8c4cf33c8e67"

RPROVIDES:${PN} += "perl-Win--Hivex \
perl-Win--Hivex--Regedit \
perl-Win-Hivex"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhivex.so.0 \
perl \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
