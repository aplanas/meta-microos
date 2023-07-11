SUMMARY = "Generate Your Projects"
DESCRIPTION = "GYP is a tool to generates native Visual Studio, Xcode and SCons and/or make \
build files from a platform-independent input format. Its syntax is a universal \
cross-platform build representation that still allows sufficient per-platform \
flexibility to accommodate irreconcilable differences"
LICENSE = "BSD-3-Clause"

PV = "0+git.20230301"

RPM_NAME = "python39-gyp-0+git.20230301-1.2.noarch.rpm"
RPM_HASH = "cdda4087cddbb7e67a2670e2ffb6f277949de36d2efa7748560cc1877b536f01059be91e021a50b3234e9be89908f964dd6c635199ebcd7a90480b1d01dd5b0c"
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
