SUMMARY = "Perl bindings for the RPM Package Manager API"
DESCRIPTION = "The RPM2 module provides an object-oriented interface to querying both the \
installed RPM database as well as files on the filesystem."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.4"

RPM_NAME = "perl-RPM2-1.4-1.29.aarch64.rpm"
RPM_HASH = "3e56b209363e421322aff034d68494350b319d2eade8a7c91520dd6572f1d659ddb88676102d48b2ccdedf5ab1f8d0fb17c449e611bbdf3ba80a775ede2f8d65"

RPROVIDES:${PN} += "perl-RPM2 \
perl-RPM2--DB \
perl-RPM2--Header \
perl-RPM2--PackageIterator \
perl-RPM2--Transaction"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librpm.so.9 \
librpmio.so.9 \
perl--MODULE-COMPAT-5.36.1 \
perl-File--Basename \
perl-File--Spec"

inherit rpm
