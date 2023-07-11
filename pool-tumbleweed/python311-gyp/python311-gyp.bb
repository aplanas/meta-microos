SUMMARY = "Generate Your Projects"
DESCRIPTION = "GYP is a tool to generates native Visual Studio, Xcode and SCons and/or make \
build files from a platform-independent input format. Its syntax is a universal \
cross-platform build representation that still allows sufficient per-platform \
flexibility to accommodate irreconcilable differences"
LICENSE = "BSD-3-Clause"

PV = "0+git.20230301"

RPM_NAME = "python311-gyp-0+git.20230301-1.2.noarch.rpm"
RPM_HASH = "8d2ff5f0dca7265cc5d54e96994da7938c74705481bafa725e5bab0784e13cfd2ef26720c859e8af25481dee468efb52ab8bcf5c3cfbd13e9aae1c70acb30cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gyp \
python3-gyp \
python3.11dist-gyp \
python311-gyp \
python3dist-gyp"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ninja \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
