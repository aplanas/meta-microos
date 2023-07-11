SUMMARY = "UsrMerge build tools"
DESCRIPTION = "Build tools related to UsrMerge. This is required for rpmbuild to \
generate proper provides tags for packages that used to have \
binaries in /(s)bin."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "compat-usrmerge-build-84.87-5.16.aarch64.rpm"
RPM_HASH = "9611f861610bbd7f835e1fb7b52bae49a61ab27247004d00dc8429200c1e8a4962abff3d54f64bb2e0f5871df7731a7d71a7a968b663c3ca8f16c6a1a86b9df9"

RPROVIDES:${PN} += "compat-usrmerge-build"

RDEPENDS:${PN} += "lua"

inherit rpm
