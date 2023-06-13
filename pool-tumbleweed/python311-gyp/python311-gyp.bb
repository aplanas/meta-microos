SUMMARY = "Generate Your Projects"
DESCRIPTION = "GYP is a tool to generates native Visual Studio, Xcode and SCons and/or make \
build files from a platform-independent input format. Its syntax is a universal \
cross-platform build representation that still allows sufficient per-platform \
flexibility to accommodate irreconcilable differences"
LICENSE = "BSD-3-Clause"

PV = "0+git.20230301"

RPM_NAME = "python311-gyp-0+git.20230301-1.1.noarch.rpm"
RPM_HASH = "61daeefffa8d841d4187f0c07a71b3f355ee627e3eb70cc1d32ac45f68d6d84b6c99f69663494d2580319778872d2009e24331fc05ead0c90661f2c52e5cd756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gyp \
python3.11dist(gyp) \
python311-gyp \
python3dist(gyp)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
ninja \
python(abi) \
python311-setuptools \
update-alternatives"

inherit rpm
