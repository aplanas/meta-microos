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

RPM_NAME = "perl-Monitoring-Plugin-0.40-1.15.noarch.rpm"
RPM_HASH = "50490b55807534007614765b56addaa54f733758d0417d2f18f159caeeb817f4dc203a93bdf0085c19db4bb5ededc799b0366c81e9c5c43c67d17105d4cc4a4d"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Class--Accessor \
perl-Config--Tiny \
perl-Math--Calc--Units \
perl-Params--Validate \
perl-base"

inherit rpm
