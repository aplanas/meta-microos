SUMMARY = "Gather package and POD information from perl module files"
DESCRIPTION = "This module provides a standard way to gather metadata about a .pm file \
through (mostly) static analysis and (some) code execution. When \
determining the version of a module, the '$VERSION' assignment is 'eval'ed, \
as is traditional in the CPAN toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.000038"

RPM_NAME = "perl-Module-Metadata-1.000038-1.1.noarch.rpm"
RPM_HASH = "2b571352ba1f487d00e7240f17f94cc52834c6752d83f3bd10115a67919210201bdd6a9e7c96f6adf03cf635595f1f3c5e0f31a51f477414ef8c627446e32ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Metadata \
perl-Module-Metadata"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-version"

inherit rpm
