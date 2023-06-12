SUMMARY = "Syntax sugar for transactional methods"
DESCRIPTION = "This method exports the 'transactional' declarator that will enclose the \
method in a txn_do call."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.009"

RPM_NAME = "perl-MooseX-TransactionalMethods-0.009-2.19.noarch.rpm"
RPM_HASH = "d3420b21cd1b88f6093b5320799b54922322777589d5cc7464b0fffa652142942d8bb732c09bb4c830269285c93c6afef34f85413025f6548f1b38c2d19a5c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(MooseX::Meta::Method::Transactional) \
perl(MooseX::Meta::Method::Transactional::Application::ToClass) \
perl(MooseX::Meta::Method::Transactional::Application::ToComposite) \
perl(MooseX::Meta::Method::Transactional::Application::ToInstance) \
perl(MooseX::Meta::Method::Transactional::Meta::Role) \
perl(MooseX::TransactionalMethods) \
perl-MooseX-TransactionalMethods"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Moose) \
perl(Sub::Name) \
perl(aliased)"

inherit rpm
