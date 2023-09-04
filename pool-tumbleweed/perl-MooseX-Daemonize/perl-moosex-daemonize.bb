SUMMARY = "Role for daemonizing your Moose based application"
DESCRIPTION = "Often you want to write a persistent daemon that has a pid file, and \
responds appropriately to Signals. This module provides a set of basic \
roles as an infrastructure to do that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-MooseX-Daemonize-0.22-1.16.noarch.rpm"
RPM_HASH = "454a68b93ea4f76c64f861fe2bca546d6280ebe96ae973354f028f4bde5cb6ab88d4271ce63abace8d1bc33010e26756ec308cb13209faccdfe8f55990f6990d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Daemonize \
perl-MooseX--Daemonize--Core \
perl-MooseX--Daemonize--Pid \
perl-MooseX--Daemonize--Pid--File \
perl-MooseX--Daemonize--WithPidFile \
perl-MooseX-Daemonize \
perl-Test--MooseX--Daemonize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-File--Path \
perl-Moose \
perl-Moose--Role \
perl-Moose--Util--TypeConstraints \
perl-MooseX--Getopt \
perl-MooseX--Getopt--OptionTypeMap \
perl-MooseX--Types--Path--Class \
perl-Sub--Exporter \
perl-namespace--autoclean"

inherit rpm
