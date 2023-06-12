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

RPM_NAME = "strip-nondeterminism-1.12.0-2.2.noarch.rpm"
RPM_HASH = "9510c86e00ffceabd3aaf6f724369d9401a63c120f7b815f4caf448d8da5d51a6c5b88d72d36e6c98c016ebb36ebfd9a35422bb47216aec5f7c72465bfccd3bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::StripNondeterminism) \
perl(File::StripNondeterminism::Common) \
perl(File::StripNondeterminism::handlers::ar) \
perl(File::StripNondeterminism::handlers::bflt) \
perl(File::StripNondeterminism::handlers::cpio) \
perl(File::StripNondeterminism::handlers::gettext) \
perl(File::StripNondeterminism::handlers::gzip) \
perl(File::StripNondeterminism::handlers::jar) \
perl(File::StripNondeterminism::handlers::javadoc) \
perl(File::StripNondeterminism::handlers::jmod) \
perl(File::StripNondeterminism::handlers::png) \
perl(File::StripNondeterminism::handlers::pyzip) \
perl(File::StripNondeterminism::handlers::uimage) \
perl(File::StripNondeterminism::handlers::zip) \
rpm_macro(have_strip_nondeterminism) \
rpm_macro(strip_all_nondeterminism) \
strip-nondeterminism"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(Archive::Zip) \
perl(Sub::Override) \
perl-base"

inherit rpm
