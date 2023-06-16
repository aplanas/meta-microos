SUMMARY = "Generate Your Projects"
DESCRIPTION = "GYP is a tool to generates native Visual Studio, Xcode and SCons and/or make \
build files from a platform-independent input format. Its syntax is a universal \
cross-platform build representation that still allows sufficient per-platform \
flexibility to accommodate irreconcilable differences"
LICENSE = "BSD-3-Clause"

PV = "0+git.20230301"

RPM_NAME = "python39-gyp-0+git.20230301-1.1.noarch.rpm"
RPM_HASH = "b95a913538a881eaa1db722bb2a4960e13e60cb0f6d1378439bfe67975cf7f5268fe9635d03b570582a46073d3e063afa764d4896bcb6d2c79bca583ebe119e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gyp \
python3.9dist-gyp \
python39-gyp \
python3dist-gyp"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ninja \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
