SUMMARY = "A tool for stripping non-deterministic information"
DESCRIPTION = "File::StripNondeterminism is a Perl module for stripping bits of \
non-deterministic information, such as timestamps and file system \
order, from files such as gzipped files, ZIP archives, and Jar files. \
It can be used as a post-processing step to make a build reproducible, \
when the build process itself cannot be made deterministic.  It is used \
as part of the Reproducible Builds project. \
 \
strip-nondeterminism contains the File::StripNondeterminism Perl module, \
and the strip-nondeterminism command line utility."
LICENSE = "GPL-3.0-or-later"

PV = "1.13.1"

RPM_NAME = "strip-nondeterminism-1.13.1-1.1.noarch.rpm"
RPM_HASH = "26d0c97f13eada6da93851ab878fd00d928280b73956c613c6e0cc889911dd7d85af3c688498d7e8021e732f912274d7d2b96c78cc482984ca08f0e5ee5f260d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--StripNondeterminism \
perl-File--StripNondeterminism--Common \
perl-File--StripNondeterminism--handlers--ar \
perl-File--StripNondeterminism--handlers--bflt \
perl-File--StripNondeterminism--handlers--cpio \
perl-File--StripNondeterminism--handlers--gettext \
perl-File--StripNondeterminism--handlers--gzip \
perl-File--StripNondeterminism--handlers--jar \
perl-File--StripNondeterminism--handlers--javadoc \
perl-File--StripNondeterminism--handlers--jmod \
perl-File--StripNondeterminism--handlers--png \
perl-File--StripNondeterminism--handlers--pyzip \
perl-File--StripNondeterminism--handlers--uimage \
perl-File--StripNondeterminism--handlers--zip \
rpm-macro-have-strip-nondeterminism \
rpm-macro-strip-all-nondeterminism \
strip-nondeterminism"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl--MODULE-COMPAT-5.36.1 \
perl-Archive--Zip \
perl-Sub--Override \
perl-base"

inherit rpm
