SUMMARY = "Simple CPAN package extractor"
DESCRIPTION = "This is a fork of Archive::Any by Michael Schwern and Clint Moore. The main \
difference is this works properly even when you fork(), and may require \
less memory to extract a tarball. On the other hand, this isn't pluggable \
(this only supports file formats used in the CPAN toolchains), and this \
doesn't check mime types (at least as of this writing)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Archive-Any-Lite-0.11-1.11.noarch.rpm"
RPM_HASH = "e0add6f4d86f268bf92bc96b5e07814ce5d497c1448ffd4e9296fa84d5192fe443b0c66d8208c79bfeb16d28e2bb87b7efbf456d13ef26b6fc00036a9d640ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Any--Lite \
perl-Archive--Any--Lite--Tar \
perl-Archive--Any--Lite--Zip \
perl-Archive-Any-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Archive--Tar \
perl-Archive--Zip \
perl-File--Temp \
perl-IO--Uncompress--Bunzip2 \
perl-IO--Zlib"

inherit rpm
