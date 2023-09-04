SUMMARY = "Family of Perl modules to streamline writing Nagios compatible plugins"
DESCRIPTION = "Monitoring::Plugin and its associated Monitoring::Plugin::* modules are a \
family of perl modules to streamline writing Monitoring plugins. The main \
end user modules are Monitoring::Plugin, providing an object-oriented \
interface to the entire Monitoring::Plugin::* collection, and \
Monitoring::Plugin::Functions, providing a simpler functional interface to \
a useful subset of the available functionality. \
 \
The purpose of the collection is to make it as simple as possible for \
developers to create plugins that conform the Monitoring Plugin guidelines \
(https://www.monitoring-plugins.org/doc/guidelines.html)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40"

RPM_NAME = "perl-Monitoring-Plugin-0.40-1.17.noarch.rpm"
RPM_HASH = "51be470cbbc60cffaff9c7ca4c83d6ef5d8ebafc7a05d7cac96a844f93131bb6034291baf9d39bf1d50bdd5c818844ec20bef58471e8941e5beddfeb99ee0fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Monitoring--Plugin \
perl-Monitoring--Plugin--Config \
perl-Monitoring--Plugin--ExitResult \
perl-Monitoring--Plugin--Functions \
perl-Monitoring--Plugin--Getopt \
perl-Monitoring--Plugin--Performance \
perl-Monitoring--Plugin--Range \
perl-Monitoring--Plugin--Threshold \
perl-Monitoring-Plugin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor \
perl-Config--Tiny \
perl-Math--Calc--Units \
perl-Params--Validate \
perl-base"

inherit rpm
