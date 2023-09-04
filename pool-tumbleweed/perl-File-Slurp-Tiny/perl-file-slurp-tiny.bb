SUMMARY = "Simple, Sane and Efficient File Slurper [Discouraged]"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-File-Slurp-Tiny-0.004-1.28.noarch.rpm"
RPM_HASH = "8b663c0f6f6b412881771273a4b629db65f8bea27d4a08a162cab314e9afad62468c434bd0df474688d6919a9f7905d52a2aed7fc539a332494a63ffc4a2ff5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Tiny \
perl-File-Slurp-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
