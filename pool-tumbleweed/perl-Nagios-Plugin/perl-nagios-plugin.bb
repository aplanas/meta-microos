SUMMARY = "A family of perl modules to streamline writing Nagios plugins"
DESCRIPTION = "Nagios::Plugin and its associated Nagios::Plugin::* modules are a family of \
perl modules to streamline writing Nagios plugins. The main end user modules \
are Nagios::Plugin, providing an object-oriented interface to the entire \
Nagios::Plugin::* collection, and Nagios::Plugin::Functions, providing a \
simpler functional interface to a useful subset of the available functionality. \
 \
The purpose of the collection is to make it as simple as possible for \
developers to create plugins that conform the Nagios Plugin guidelines \
(http://nagiosplug.sourceforge.net/developer-guidelines.html)."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "0.36"

RPM_NAME = "perl-Nagios-Plugin-0.36-10.28.aarch64.rpm"
RPM_HASH = "476c554823e0df8982b90c680926ffcad715190b37bc215f8b0e1d91d6bc616cbf9672055cc5078c6e44b3e86f949c779018afffe78bf142a84321daa52e2e52"

RPROVIDES:${PN} += "Nagios-Plugin \
perl-Nagios--Plugin \
perl-Nagios--Plugin--Config \
perl-Nagios--Plugin--ExitResult \
perl-Nagios--Plugin--Functions \
perl-Nagios--Plugin--Getopt \
perl-Nagios--Plugin--Performance \
perl-Nagios--Plugin--Range \
perl-Nagios--Plugin--Threshold \
perl-Nagios-Plugin"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor \
perl-Config--Tiny \
perl-Math--Calc--Units \
perl-Params--Validate"

inherit rpm
