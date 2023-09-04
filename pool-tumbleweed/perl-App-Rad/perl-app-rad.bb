SUMMARY = "Framework to facilitate creation of command line applications"
DESCRIPTION = "App::Rad is a framework for developing \
command-line applications. It can transform Perl _one-liners_ \
into subroutines than can be called by the user of your \
program. \
 \
It also provides an interface for common command-line \
tasks."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.05"

RPM_NAME = "perl-App-Rad-1.05-1.25.noarch.rpm"
RPM_HASH = "df5a23951caeeb54092ac15328b4192d05bcd3bdfe9a616ab2d0c0e9db3d0e6643311ff29538bac4052f63b9db5823f26f0ef9a9686bc4a901664e78fe33c108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Rad \
perl-App--Rad--Config \
perl-App--Rad--Exclude \
perl-App--Rad--Help \
perl-App--Rad--Include \
perl-App-Rad"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Getopt--Long"

inherit rpm
