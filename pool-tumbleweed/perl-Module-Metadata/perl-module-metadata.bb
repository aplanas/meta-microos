SUMMARY = "Gather package and POD information from perl module files"
DESCRIPTION = "This module provides a standard way to gather metadata about a .pm file \
through (mostly) static analysis and (some) code execution. When \
determining the version of a module, the '$VERSION' assignment is 'eval'ed, \
as is traditional in the CPAN toolchain."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.000038"

RPM_NAME = "perl-Module-Metadata-1.000038-1.2.noarch.rpm"
RPM_HASH = "11dfce22b819378a5ed088c6bee39974cde7a90a3b517652d0794ab7aa8a1757b96c7a475cbbf1fce88a4f28b02fb6ba578c37d1e4983ae85a803683aa81a41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Metadata \
perl-Module-Metadata"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-version"

inherit rpm
