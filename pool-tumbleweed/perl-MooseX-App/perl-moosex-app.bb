SUMMARY = "Write user-friendly command line apps with even less suffering"
DESCRIPTION = "MooseX-App is a highly customisable helper to write user-friendly command \
line applications without having to worry about most of the annoying things \
usually involved. Just take any existing Moose class, add a single line \
('use MooseX-App qw(PluginA PluginB ...);') and create one class for each \
command in an underlying namespace. Options and positional parameters can \
be defined as simple Moose accessors using the 'option' and 'parameter' \
keywords respectively."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.42"

RPM_NAME = "perl-MooseX-App-1.42-1.9.noarch.rpm"
RPM_HASH = "4a712f0207ed32fd7bb7be74d890b63ed4e5e28356bb8f5b18517a1005042df80d77a7b0425c2bc6817f00c62ba8029fd03790660b9ead798d0536ffa9631be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Moose::Meta::Attribute::Custom::Trait::AppDepends) \
perl(Moose::Meta::Attribute::Custom::Trait::AppMutexGroup) \
perl(Moose::Meta::Attribute::Custom::Trait::AppOption) \
perl(Moose::Meta::Attribute::Custom::Trait::AppTerm) \
perl(MooseX::App) \
perl(MooseX::App::Command) \
perl(MooseX::App::Exporter) \
perl(MooseX::App::Message::Block) \
perl(MooseX::App::Message::BlockColor) \
perl(MooseX::App::Message::Envelope) \
perl(MooseX::App::Meta::Role::Attribute::Option) \
perl(MooseX::App::Meta::Role::Class::Base) \
perl(MooseX::App::Meta::Role::Class::Command) \
perl(MooseX::App::Meta::Role::Class::Documentation) \
perl(MooseX::App::Meta::Role::Class::Simple) \
perl(MooseX::App::Null) \
perl(MooseX::App::ParsedArgv) \
perl(MooseX::App::ParsedArgv::Element) \
perl(MooseX::App::ParsedArgv::Value) \
perl(MooseX::App::Plugin::BashCompletion) \
perl(MooseX::App::Plugin::BashCompletion::Command) \
perl(MooseX::App::Plugin::BashCompletion::Meta::Class) \
perl(MooseX::App::Plugin::Color) \
perl(MooseX::App::Plugin::Color::Meta::Class) \
perl(MooseX::App::Plugin::Config) \
perl(MooseX::App::Plugin::Config::Meta::Class) \
perl(MooseX::App::Plugin::ConfigHome) \
perl(MooseX::App::Plugin::ConfigHome::Meta::Class) \
perl(MooseX::App::Plugin::Depends) \
perl(MooseX::App::Plugin::Depends::Meta::Attribute) \
perl(MooseX::App::Plugin::Depends::Meta::Class) \
perl(MooseX::App::Plugin::Env) \
perl(MooseX::App::Plugin::Fuzzy) \
perl(MooseX::App::Plugin::Man) \
perl(MooseX::App::Plugin::Man::Command) \
perl(MooseX::App::Plugin::Man::Meta::Class) \
perl(MooseX::App::Plugin::MutexGroup) \
perl(MooseX::App::Plugin::MutexGroup::Meta::Attribute) \
perl(MooseX::App::Plugin::MutexGroup::Meta::Class) \
perl(MooseX::App::Plugin::Term) \
perl(MooseX::App::Plugin::Term::Meta::Attribute) \
perl(MooseX::App::Plugin::Term::Meta::Class) \
perl(MooseX::App::Plugin::Typo) \
perl(MooseX::App::Plugin::Typo::Meta::Class) \
perl(MooseX::App::Plugin::Version) \
perl(MooseX::App::Plugin::Version::Command) \
perl(MooseX::App::Plugin::Version::Meta::Class) \
perl(MooseX::App::Role) \
perl(MooseX::App::Role::Base) \
perl(MooseX::App::Role::Common) \
perl(MooseX::App::Simple) \
perl(MooseX::App::Utils) \
perl-MooseX-App"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(List::Util) \
perl(Module::Pluggable) \
perl(Moose) \
perl(Pod::Elemental) \
perl(namespace::autoclean)"

inherit rpm
