SUMMARY = "Perl module dependency manager (aka Bundler for Perl)"
DESCRIPTION = "carton is a command line tool to track the Perl module dependencies for \
your Perl application. Dependencies are declared using cpanfile format, and \
the managed dependencies are tracked in a _cpanfile.snapshot_ file, which \
is meant to be version controlled, and the snapshot file allows other \
developers of your application will have the exact same versions of the \
modules. \
 \
For 'cpanfile' syntax, see cpanfile documentation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.0.35"

RPM_NAME = "perl-Carton-1.0.35-1.7.noarch.rpm"
RPM_HASH = "255e6080f764fd70efda9860f2bb932a0ae41ed089d328ab54784bc41a31991327a76e3c491c9335331c05e4c3d80a7e8f3a12a1f6c94706e5a2440348f3a3f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Carton \
perl-Carton--Builder \
perl-Carton--CLI \
perl-Carton--CPANfile \
perl-Carton--Dependency \
perl-Carton--Dist \
perl-Carton--Dist--Core \
perl-Carton--Environment \
perl-Carton--Error \
perl-Carton--Error--CPANfileNotFound \
perl-Carton--Error--CommandExit \
perl-Carton--Error--CommandNotFound \
perl-Carton--Error--SnapshotNotFound \
perl-Carton--Error--SnapshotParseError \
perl-Carton--Index \
perl-Carton--Mirror \
perl-Carton--Package \
perl-Carton--Packer \
perl-Carton--Snapshot \
perl-Carton--Snapshot--Emitter \
perl-Carton--Snapshot--Parser \
perl-Carton--Tree \
perl-Carton--Util"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-CPAN--Meta \
perl-CPAN--Meta--Requirements \
perl-Class--Tiny \
perl-Getopt--Long \
perl-JSON--PP \
perl-Menlo--CLI--Compat \
perl-Module--CPANfile \
perl-Module--CoreList \
perl-Path--Tiny \
perl-Try--Tiny \
perl-parent"

inherit rpm
