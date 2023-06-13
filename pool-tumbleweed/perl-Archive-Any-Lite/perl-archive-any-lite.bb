SUMMARY = "Simple CPAN package extractor"
DESCRIPTION = "This is a fork of Archive::Any by Michael Schwern and Clint Moore. The main \
difference is this works properly even when you fork(), and may require \
less memory to extract a tarball. On the other hand, this isn't pluggable \
(this only supports file formats used in the CPAN toolchains), and this \
doesn't check mime types (at least as of this writing)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Archive-Any-Lite-0.11-1.9.noarch.rpm"
RPM_HASH = "1d29a053fbc3eac520626a08659487ccd8460c4d2c63bec40f286c7ba2a810dc15706c193cd4402f0e4db9f2f9370508e294f5e8c59cf5a5c5318da76bb94fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Archive::Any::Lite) \
perl(Archive::Any::Lite::Tar) \
perl(Archive::Any::Lite::Zip) \
perl-Archive-Any-Lite"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Tar) \
perl(Archive::Zip) \
perl(File::Temp) \
perl(IO::Uncompress::Bunzip2) \
perl(IO::Zlib)"

inherit rpm
