SUMMARY = "Simple CPAN package extractor"
DESCRIPTION = "This is a fork of Archive::Any by Michael Schwern and Clint Moore. The main \
difference is this works properly even when you fork(), and may require \
less memory to extract a tarball. On the other hand, this isn't pluggable \
(this only supports file formats used in the CPAN toolchains), and this \
doesn't check mime types (at least as of this writing)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Archive-Any-Lite-0.11-1.10.noarch.rpm"
RPM_HASH = "ad7f5b32f00842ff305d8ae83d721c7b22643d3ba675f07da4da28b1690033d26e9cad2494ec4cc6908bd4dba991e8237701ca53160da0417c7639f339354c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Any--Lite \
perl-Archive--Any--Lite--Tar \
perl-Archive--Any--Lite--Zip \
perl-Archive-Any-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Tar \
perl-Archive--Zip \
perl-File--Temp \
perl-IO--Uncompress--Bunzip2 \
perl-IO--Zlib"

inherit rpm
