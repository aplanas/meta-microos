SUMMARY = "Perl bindings for the RPM Package Manager API"
DESCRIPTION = "The RPM2 module provides an object-oriented interface to querying both the \
installed RPM database as well as files on the filesystem."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.4"

RPM_NAME = "perl-RPM2-1.4-1.30.aarch64.rpm"
RPM_HASH = "a4390757c6e86b1ff022b14200be8e966c4393e24fbf80ba147f4401387a64a2eede0703d1dff213f42e1deaa6d4e8bb0c060707457de7998ca4492141e93af8"

RPROVIDES:${PN} += "perl-RPM2 \
perl-RPM2--DB \
perl-RPM2--Header \
perl-RPM2--PackageIterator \
perl-RPM2--Transaction"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.9 \
librpmio.so.9 \
perl--MODULE-COMPAT-5.38.0 \
perl-File--Basename \
perl-File--Spec"

inherit rpm
