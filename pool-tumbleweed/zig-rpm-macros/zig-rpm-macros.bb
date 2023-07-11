SUMMARY = "Common RPM macros for zig"
DESCRIPTION = "This package contains common RPM macros for zig."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "zig-rpm-macros-0.10.1-2.4.noarch.rpm"
RPM_HASH = "123be5ef83018e49bb27149e4fe06df5c78c4b75a9b3545d041ff150efaa7914799f8f69b23cf341061e754828f5ad1f711daca4b1817ab005fc6c83f5c06230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro--zig-advanced-options \
rpm-macro--zig-build-options \
rpm-macro--zig-cpu \
rpm-macro--zig-general-options \
rpm-macro--zig-install-options \
rpm-macro--zig-project-options \
rpm-macro--zig-target \
rpm-macro--zig-version \
rpm-macro-zig \
rpm-macro-zig-arches \
rpm-macro-zig-build \
rpm-macro-zig-install \
rpm-macro-zig-test \
zig-rpm-macros"

RDEPENDS:${PN} += "rpm"

inherit rpm
