SUMMARY = "do use_ok() for all the MANIFESTed modules"
DESCRIPTION = "I'm sick of writing 00_load.t (or something like that) that'll do use_ok() \
for every module I write. I'm sicker of updating 00_load.t when I add \
another file to the distro. This module reads MANIFEST to find modules to \
be tested and does use_ok() for each of them. Now all you have to do is \
update MANIFEST. You don't have to modify the test any more (hopefully)."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.17"

RPM_NAME = "perl-Test-UseAllModules-0.17-1.27.noarch.rpm"
RPM_HASH = "7800036c4bad8365ded87208105f310ed5a8d6b0dd7bde9275a6dccc31d68c20c9fbeeda0095a645aca5052d4e3af39cfc9e2fade96e31f18bf6ff5e37e2af54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--UseAllModules \
perl-Test-UseAllModules"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1"

inherit rpm
