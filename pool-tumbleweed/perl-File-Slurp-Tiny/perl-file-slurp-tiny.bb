SUMMARY = "Simple, Sane and Efficient File Slurper [Discouraged]"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.004"

RPM_NAME = "perl-File-Slurp-Tiny-0.004-1.26.noarch.rpm"
RPM_HASH = "ad56efb47d628291b67e6755e6a58d004935cad0bb2d3775825a4fafae9f68e614b9c9820f76b03eb65f5abdc3535c0c318dc1d6173d663c7500e7561c80c603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Tiny \
perl-File-Slurp-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0"

inherit rpm
