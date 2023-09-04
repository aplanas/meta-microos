SUMMARY = "Various portability utilities for module builders"
DESCRIPTION = "This module provides various portable helper functions for module building \
modules."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.026"

RPM_NAME = "perl-ExtUtils-Helpers-0.026-1.25.noarch.rpm"
RPM_HASH = "19cc47056da8edef9d5d05ff2c732a4eae67458cd4cf6d346c9c4ff172d5d1feea1029739a5017f9967106b2e8e0a6a771155514acd68b7f781b120444dde033"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-ExtUtils--Helpers \
perl-ExtUtils--Helpers--Unix \
perl-ExtUtils--Helpers--VMS \
perl-ExtUtils--Helpers--Windows \
perl-ExtUtils-Helpers"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
