SUMMARY = "Simple, sane and efficient module to slurp a file"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported. All functions throw exceptions on \
errors, write functions don't return any meaningful value."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.014"

RPM_NAME = "perl-File-Slurper-0.014-1.3.noarch.rpm"
RPM_HASH = "7998da7e75469bcc4843ebe5c2b8dcbff069d2a341228ca6b994a42672889f7ccaae1b0a94898baae80c769f3519e7b27212eb4394420fae9f3025454dc6696b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurper \
perl-File-Slurper"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
