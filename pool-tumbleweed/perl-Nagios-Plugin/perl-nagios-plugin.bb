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

RPM_NAME = "perl-Nagios-Plugin-0.36-10.27.aarch64.rpm"
RPM_HASH = "a4f3881d99a5ef09f50787212397aea336a28159d5dd94db7ee2c20f5d0dd968ef97aae66550336569f5fc2b40eaa463e39d0f2cd0fe55ff090a519c3548c2a9"

RPROVIDES:${PN} += "Nagios-Plugin \
perl(Nagios::Plugin) \
perl(Nagios::Plugin::Config) \
perl(Nagios::Plugin::ExitResult) \
perl(Nagios::Plugin::Functions) \
perl(Nagios::Plugin::Getopt) \
perl(Nagios::Plugin::Performance) \
perl(Nagios::Plugin::Range) \
perl(Nagios::Plugin::Threshold) \
perl-Nagios-Plugin \
perl-Nagios-Plugin(aarch-64)"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor) \
perl(Config::Tiny) \
perl(Math::Calc::Units) \
perl(Params::Validate)"

inherit rpm
