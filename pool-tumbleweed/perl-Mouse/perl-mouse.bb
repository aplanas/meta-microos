SUMMARY = "Moose minus the antlers"
DESCRIPTION = "Moose is a postmodern object system for Perl5. Moose is wonderful. \
 \
Unfortunately, Moose has a compile-time penalty. Though significant \
progress has been made over the years, the compile time penalty is a \
non-starter for some very specific applications. If you are writing a \
command-line application or CGI script where startup time is essential, you \
may not be able to use Moose (we recommend that you instead use persistent \
Perl executing environments like 'FastCGI' for the latter, if possible). \
 \
Mouse is a Moose compatible object system, which aims to alleviate this \
penalty by providing a subset of Moose's functionality. \
 \
We're also going as light on dependencies as possible. Mouse currently has \
*no dependencies* except for building/testing modules. Mouse also works \
without XS, although it has an XS backend to make it much faster."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.5.10"

RPM_NAME = "perl-Mouse-2.5.10-1.17.aarch64.rpm"
RPM_HASH = "a08c96b8a9e8a084e65dfb44b884636233f516f115bc0cae2cbf758b3ac166819b945a9a67525a60d958c531275cd244380e2d1f3b10b3d3725889e04c72a98b"

RPROVIDES:${PN} += "perl(Mouse) \
perl(Mouse::Exporter) \
perl(Mouse::Meta::Attribute) \
perl(Mouse::Meta::Class) \
perl(Mouse::Meta::Method) \
perl(Mouse::Meta::Method::Accessor) \
perl(Mouse::Meta::Method::Constructor) \
perl(Mouse::Meta::Method::Delegation) \
perl(Mouse::Meta::Method::Destructor) \
perl(Mouse::Meta::Module) \
perl(Mouse::Meta::Role) \
perl(Mouse::Meta::Role::Application) \
perl(Mouse::Meta::Role::Application::RoleSummation) \
perl(Mouse::Meta::Role::Composite) \
perl(Mouse::Meta::Role::Method) \
perl(Mouse::Meta::TypeConstraint) \
perl(Mouse::Object) \
perl(Mouse::PurePerl) \
perl(Mouse::Role) \
perl(Mouse::Spec) \
perl(Mouse::Tiny) \
perl(Mouse::TypeRegistry) \
perl(Mouse::Util) \
perl(Mouse::Util::MetaRole) \
perl(Mouse::Util::TypeConstraints) \
perl(Squirrel) \
perl(Squirrel::Role) \
perl(Test::Mouse) \
perl(ouse) \
perl-Mouse \
perl-Mouse(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
