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

PV = "1.12.0"

RPM_NAME = "strip-nondeterminism-1.12.0-2.3.noarch.rpm"
RPM_HASH = "1ca0dad38700c4321ef17c223f2b5afbab0b56a8f34603b9dcddc3fa075d5013728dd99fa1ee5e9af503bd56a0549f5ec14c5cd7c76b280cd380b8aca9d80ca2"
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
