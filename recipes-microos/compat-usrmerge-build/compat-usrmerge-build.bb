SUMMARY = "UsrMerge build tools"
DESCRIPTION = "Build tools related to UsrMerge. This is required for rpmbuild to \
generate proper provides tags for packages that used to have \
binaries in /(s)bin."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-build-84.87-5.14.aarch64.rpm"
RPM_HASH = "0c3f6253d731e7465ba20e0c4a587f4f84a712d133a28584496bbd864ce00f7bc6a4b72ab813d3ef71c24d4a0a61c84de9f254e37bfa97dfeda387f93d87f17f"

RPROVIDES:${PN} += "compat-usrmerge-build \
compat-usrmerge-build(aarch-64)"
RDEPENDS:${PN} += "lua"

inherit rpm
