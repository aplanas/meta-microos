SUMMARY = "Check for uncleaned imports"
DESCRIPTION = "This module lets you check your module's namespaces for imported functions \
you might have forgotten to remove with namespace::autoclean or \
namespace::clean and are therefore available to be called as methods, which \
usually isn't want you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-Test-CleanNamespaces-0.24-1.18.noarch.rpm"
RPM_HASH = "bf77039dc791b47fe4afc802a9ff68865d76b831f3ba17ef29de0b6bd80e921eaffc868c5b9511b473f7b92a7ead8aac2458e6662aba99dc2c1d8add857c2de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CleanNamespaces \
perl-Test-CleanNamespaces"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Runtime \
perl-Package--Stash \
perl-Role--Tiny \
perl-Sub--Identify"

inherit rpm
