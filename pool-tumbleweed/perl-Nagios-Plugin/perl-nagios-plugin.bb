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

RPM_NAME = "perl-Nagios-Plugin-0.36-10.29.aarch64.rpm"
RPM_HASH = "c348b8077cfc4feed559658e1d5038a6c2299846d62f2dddd3c8bc681e91d9ca0ca6d7c4b28d0c20df7f1a40f97e80b731a975fcbac47e05cefab17310284784"

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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Class--Accessor \
perl-Config--Tiny \
perl-Math--Calc--Units \
perl-Params--Validate"

inherit rpm
