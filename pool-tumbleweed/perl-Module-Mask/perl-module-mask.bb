SUMMARY = "Pretend certain modules are not installed"
DESCRIPTION = "Sometimes you need to test what happens when a given module is not \
installed. This module provides a way of temporarily hiding installed \
modules from perl's require mechanism. The Module::Mask object adds itself \
to @INC and blocks require calls to restricted modules. \
 \
Module::Mask will not affect modules already loaded at time of \
instantiation."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.06"

RPM_NAME = "perl-Module-Mask-0.06-1.10.noarch.rpm"
RPM_HASH = "dbdc9f3a773ec1c57e90203c0a92bdc3a628ae4e6272a226ed8ad06fe9c98b969cb633082f7f7a9aeab79c9879afbb8c5287f230cd2f0fe8c8335a7463596fcc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Mask \
perl-Module-Mask"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Module--Util"

inherit rpm
