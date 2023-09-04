SUMMARY = "do use_ok() for all the MANIFESTed modules"
DESCRIPTION = "I'm sick of writing 00_load.t (or something like that) that'll do use_ok() \
for every module I write. I'm sicker of updating 00_load.t when I add \
another file to the distro. This module reads MANIFEST to find modules to \
be tested and does use_ok() for each of them. Now all you have to do is \
update MANIFEST. You don't have to modify the test any more (hopefully)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Test-UseAllModules-0.17-1.28.noarch.rpm"
RPM_HASH = "e24decf4fef5036e3319bd7382c548eb7fb6ac6e1d48541dc5ec45b668be2c7e83bd342e270f25a74d83aae82c261f5b7652cbe2343b1dc8d7d1bab31614e5e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--UseAllModules \
perl-Test-UseAllModules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0"

inherit rpm
