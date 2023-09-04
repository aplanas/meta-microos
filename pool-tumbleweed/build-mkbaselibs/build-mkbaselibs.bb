SUMMARY = "Tools to generate base lib packages"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating base lib packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230808"

RPM_NAME = "build-mkbaselibs-20230808-1.1.noarch.rpm"
RPM_HASH = "e1e294d9816c74d872035a63603713b2a8bb9acd99ebe86387e5225791d1fc492a8eed805cf5b8acb261c73128ace291cf542be97f756ced075da376d24a121f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkbaselibs"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
