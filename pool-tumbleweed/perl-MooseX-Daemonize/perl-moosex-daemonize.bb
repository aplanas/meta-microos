SUMMARY = "Role for daemonizing your Moose based application"
DESCRIPTION = "Often you want to write a persistent daemon that has a pid file, and \
responds appropriately to Signals. This module provides a set of basic \
roles as an infrastructure to do that."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.22"

RPM_NAME = "perl-MooseX-Daemonize-0.22-1.15.noarch.rpm"
RPM_HASH = "e4008d7666310ba5ef6dad3fb6a92b8f049546359cb268643d55d61ae2a247d34893b0868f2a692d811ec0563634f682fa599c60eb521a28759f84ee6ffa3e11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MooseX--Daemonize \
perl-MooseX--Daemonize--Core \
perl-MooseX--Daemonize--Pid \
perl-MooseX--Daemonize--Pid--File \
perl-MooseX--Daemonize--WithPidFile \
perl-MooseX-Daemonize \
perl-Test--MooseX--Daemonize"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
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
