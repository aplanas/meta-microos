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

RPM_NAME = "perl-Module-Mask-0.06-1.9.noarch.rpm"
RPM_HASH = "cbe9038bd4f814dd17d01dd52a605b9df47531ad9a164d11fb79f14cdcc4f623d0d858e91e9342e8e96924605e6f07ca618c40420b20e20b6a0e5836a7370cb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Mask \
perl-Module-Mask"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Module--Util"

inherit rpm
