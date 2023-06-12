SUMMARY = "Development files for espeak-ng compatible with espeak"
DESCRIPTION = "This package contains development files for espeak-ng \
compatible with the original espeak."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.51"

RPM_NAME = "espeak-ng-compat-devel-1.51-1.8.aarch64.rpm"
RPM_HASH = "c9b8f7332d0a2c44dd023eca0d4711c47476b651721a56e828fb2cec3ddb61d960618d37827700e42517cc2d86665e2444a7252cc5c710327068b0106884ae5e"

RPROVIDES:${PN} += "espeak-ng-compat-devel \
espeak-ng-compat-devel(aarch-64)"
RDEPENDS:${PN} += "espeak-ng-compat \
espeak-ng-devel \
libespeak-ng1"

inherit rpm
