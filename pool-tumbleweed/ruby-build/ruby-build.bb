SUMMARY = "Compile and install Ruby"
DESCRIPTION = "ruby-build provides a simple way to compile and install different versions of Ruby on UNIX-like systems."
LICENSE = "MIT"

PV = "20230615"

RPM_NAME = "ruby-build-20230615-1.1.noarch.rpm"
RPM_HASH = "15466286ab337de30a5a92004b64fb30312a948638caa4c40859936821a7b740b11cd7667a27bc7f29f023509047d06445f1a853b51f0df7ec727cf760766b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build"

RDEPENDS:${PN} += "/usr/bin/bash \
bash \
curl \
gzip \
make \
tar"

inherit rpm
