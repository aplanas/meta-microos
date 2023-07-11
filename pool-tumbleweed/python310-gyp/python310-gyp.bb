SUMMARY = "Generate Your Projects"
DESCRIPTION = "GYP is a tool to generates native Visual Studio, Xcode and SCons and/or make \
build files from a platform-independent input format. Its syntax is a universal \
cross-platform build representation that still allows sufficient per-platform \
flexibility to accommodate irreconcilable differences"
LICENSE = "BSD-3-Clause"

PV = "0+git.20230301"

RPM_NAME = "python310-gyp-0+git.20230301-1.2.noarch.rpm"
RPM_HASH = "e6f47a44b5c696b3195c37564fb3f15d79b9e5bc7ea5e2a2a970403763d858f8ad376ff3e0a2f2cd1dcbf5a06be5908e1f139a4067794f52b3a8ced2f4021596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gyp \
python3.10dist-gyp \
python310-gyp \
python3dist-gyp"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ninja \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
