SUMMARY = "Meta package for dependencies to build PicoRuby"
DESCRIPTION = "Meta package for ruby-build dependencies to build PicoRuby."
LICENSE = "MIT"

PV = "20230615"

RPM_NAME = "ruby-build-dependencies-picoruby-20230615-1.1.noarch.rpm"
RPM_HASH = "f7c819e23d681e381b80f03c52c830e6f71467dcce73a562efbcaaf066beef1344411fedd9748dd631211f4a53fd23a5c738a1bfcb9d2c483ac02e1cbee109fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ruby-build-dependencies-picoruby"

RDEPENDS:${PN} += "gcc \
git"

inherit rpm
