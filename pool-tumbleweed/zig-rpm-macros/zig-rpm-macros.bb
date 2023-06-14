SUMMARY = "Common RPM macros for zig"
DESCRIPTION = "This package contains common RPM macros for zig."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "zig-rpm-macros-0.10.1-2.3.noarch.rpm"
RPM_HASH = "3d6b3b3edc0b3fe24e25430edcd2ec28f432223ee5f64b804f7fd4909138d79beae159d7cf7ae0859d89c72f5b8dc78a64167045b6743b237663cb7b6a47f31f"
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
