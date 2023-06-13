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

RPM_NAME = "perl-Module-Mask-0.06-1.8.noarch.rpm"
RPM_HASH = "575385eea1d3a8d68474e532248b2129c77d3d54d055c5c25ef637c2174c277c04401e0cd39e4de34d61638606e936faca339b53817442f79352115f24e3bd4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Module::Mask) \
perl-Module-Mask"

RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Module::Util)"

inherit rpm
