SUMMARY = "Syntax sugar for authorized methods"
DESCRIPTION = "This method exports the 'authorized' declarator that makes a verification \
if the user has the required permissions before the acual invocation. The \
default verification method will take the 'user' method result and call \
'roles' to list the roles given to that user."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.006"

RPM_NAME = "perl-MooseX-AuthorizedMethods-0.006-11.1.noarch.rpm"
RPM_HASH = "fa41094e7e026713ef239a66a5d11b524ad25fdeabe234b83a2b176c9c9e7217bad3965e4f61c04c7b8f2fd2c9711a36e564a88c6d6106029f0960699557dadb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::AuthorizedMethods) \
perl(MooseX::Meta::Method::Authorized) \
perl(MooseX::Meta::Method::Authorized::Application::ToClass) \
perl(MooseX::Meta::Method::Authorized::Application::ToComposite) \
perl(MooseX::Meta::Method::Authorized::Application::ToInstance) \
perl(MooseX::Meta::Method::Authorized::CheckRoles) \
perl(MooseX::Meta::Method::Authorized::Meta::Role) \
perl-MooseX-AuthorizedMethods"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(aliased)"

inherit rpm
