SUMMARY = "do use_ok() for all the MANIFESTed modules"
DESCRIPTION = "I'm sick of writing 00_load.t (or something like that) that'll do use_ok() \
for every module I write. I'm sicker of updating 00_load.t when I add \
another file to the distro. This module reads MANIFEST to find modules to \
be tested and does use_ok() for each of them. Now all you have to do is \
update MANIFEST. You don't have to modify the test any more (hopefully)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Test-UseAllModules-0.17-1.26.noarch.rpm"
RPM_HASH = "991ca8762f8be7ef524ab3a23156ef14937ed3f674585ad87ca6d1374388886e500a55b05db32057ff65370ae857d2779d9645028342602ab1cabf55751de5cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Test::UseAllModules) \
perl-Test-UseAllModules"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
