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

RPM_NAME = "perl-Monitoring-Plugin-0.40-1.16.noarch.rpm"
RPM_HASH = "577c866161605ad5c42cf39f691088402b94ef48b86a7432014a5fb422855e5ea4283d27c0b6f1de2489f7e05ba40ea8bc7672dbd4251b60c8929facb2b826f3"
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

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Class--Accessor \
perl-Config--Tiny \
perl-Math--Calc--Units \
perl-Params--Validate \
perl-base"

inherit rpm
