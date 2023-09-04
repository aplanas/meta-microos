SUMMARY = "Check for uncleaned imports"
DESCRIPTION = "This module lets you check your module's namespaces for imported functions \
you might have forgotten to remove with namespace::autoclean or \
namespace::clean and are therefore available to be called as methods, which \
usually isn't want you want."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.24"

RPM_NAME = "perl-Test-CleanNamespaces-0.24-1.19.noarch.rpm"
RPM_HASH = "c99d575c2411302432a0d98fef7b913c28102e87942c223125ee59e782c684fa898dc91c4cfecfb29c3d2a3d18dc71f99dfee49b258ef5cb1042aac0ce2bbccc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--CleanNamespaces \
perl-Test-CleanNamespaces"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Runtime \
perl-Package--Stash \
perl-Role--Tiny \
perl-Sub--Identify"

inherit rpm
