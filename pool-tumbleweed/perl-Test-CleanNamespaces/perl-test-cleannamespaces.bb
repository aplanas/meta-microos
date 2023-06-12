SUMMARY = "Check for uncleaned imports"
DESCRIPTION = "This module lets you check your module's namespaces for imported functions \
you might have forgotten to remove with namespace::autoclean or \
namespace::clean and are therefore available to be called as methods, which \
usually isn't want you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-Test-CleanNamespaces-0.24-1.17.noarch.rpm"
RPM_HASH = "e6e4846a0fc7405ad1d7bc3b40f71c0822098458cc2fa1d03e3fa09aad37d78f99e763a4c5144bdaf80401ec4fdb1efac5d8d59907ad1daad06e52da8448d0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::CleanNamespaces) \
perl-Test-CleanNamespaces"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Runtime) \
perl(Package::Stash) \
perl(Role::Tiny) \
perl(Sub::Identify)"

inherit rpm
