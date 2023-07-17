SUMMARY = "Compile and install Ruby"
DESCRIPTION = "ruby-build provides a simple way to compile and install different versions of Ruby on UNIX-like systems."
LICENSE = "MIT"

PV = "20230710"

RPM_NAME = "ruby-build-20230710-1.1.noarch.rpm"
RPM_HASH = "72d733ef800aee97661247224d1ffaf167f2b0cc56136c32c276b97f0660945f1e318201a1ea79ad30425288c4bcf3ef80089253bf143a28b716212d5524ff7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
gzip \
make \
tar"

inherit rpm
