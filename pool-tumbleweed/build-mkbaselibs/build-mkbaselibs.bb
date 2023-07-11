SUMMARY = "Tools to generate base lib packages"
DESCRIPTION = "This package contains the parts which may be installed in the inner build system \
for generating base lib packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "20230628"

RPM_NAME = "build-mkbaselibs-20230628-1.1.noarch.rpm"
RPM_HASH = "0d48ba9d0e43199ac865fe6aa0220547d678178dde7a9e3eaf536754d8b4065b8dd2a550f24146d8163f17deec5b4e520cb943efeeb4eda4b29561f94091779a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "build-mkbaselibs"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
