SUMMARY = "Comprehensive template processing system"
DESCRIPTION = "comprehensive template processing system"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.101"

RPM_NAME = "perl-Template-Toolkit-3.101-1.2.aarch64.rpm"
RPM_HASH = "7d56c9f3ea8237631988471b6bd04a9f056d83ee58256fce636d58bd917cc0306faa527c82d00868abb99d71e6e2f2ecba28372f35a813b3f81c89309c1cf9de"

RPROVIDES:${PN} += "perl(Template) \
perl(Template::Base) \
perl(Template::Config) \
perl(Template::Constants) \
perl(Template::Context) \
perl(Template::Directive) \
perl(Template::Document) \
perl(Template::Exception) \
perl(Template::Filters) \
perl(Template::Grammar) \
perl(Template::Iterator) \
perl(Template::Monad::Assert) \
perl(Template::Monad::Scalar) \
perl(Template::Namespace::Constants) \
perl(Template::Parser) \
perl(Template::Perl) \
perl(Template::Plugin) \
perl(Template::Plugin::Assert) \
perl(Template::Plugin::Datafile) \
perl(Template::Plugin::Date) \
perl(Template::Plugin::Date::Calc) \
perl(Template::Plugin::Date::Manip) \
perl(Template::Plugin::Directory) \
perl(Template::Plugin::Dumper) \
perl(Template::Plugin::File) \
perl(Template::Plugin::Filter) \
perl(Template::Plugin::Format) \
perl(Template::Plugin::HTML) \
perl(Template::Plugin::Image) \
perl(Template::Plugin::Iterator) \
perl(Template::Plugin::Math) \
perl(Template::Plugin::Pod) \
perl(Template::Plugin::Procedural) \
perl(Template::Plugin::Scalar) \
perl(Template::Plugin::String) \
perl(Template::Plugin::Table) \
perl(Template::Plugin::URL) \
perl(Template::Plugin::View) \
perl(Template::Plugin::Wrap) \
perl(Template::Plugins) \
perl(Template::Provider) \
perl(Template::Service) \
perl(Template::Stash) \
perl(Template::Stash::Context) \
perl(Template::Stash::XS) \
perl(Template::Test) \
perl(Template::TieString) \
perl(Template::Toolkit) \
perl(Template::VMethods) \
perl(Template::View) \
perl-Template-Toolkit \
perl-Template-Toolkit(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(AppConfig)"

inherit rpm
