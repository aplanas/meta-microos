SUMMARY = "Simple, Sane and Efficient File Slurper [Discouraged]"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-File-Slurp-Tiny-0.004-1.27.noarch.rpm"
RPM_HASH = "3a3698a1b84f3b6793823691da73b301d6a76429b72c9812d19ba45e66aa8f0758677c0908d325af74e2984efa88e5e5da7b4113ff1eeeca92c418eea58ac6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Tiny \
perl-File-Slurp-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
