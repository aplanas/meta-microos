SUMMARY = "Basic Directory Layout"
DESCRIPTION = "This package installs the basic directory structure. It also includes \
the home directories of system users."
LICENSE = "MIT"

PV = "84.87"

RPM_NAME = "filesystem-84.87-12.1.aarch64.rpm"
RPM_HASH = "c3ca61c9b8471c85cdecc17756040752feb802745e542b7ef086c4c9a406329337b64da0b4981ea1cbbd8a46474b9ca8d9db2106739dd3e64915ff3ade7caf88"

RPROVIDES:${PN} += "filesystem filesystem(aarch-64)"
RDEPENDS:${PN} += "(compat-usrmerge-tools or rpmlib(X-CheckUnifiedSystemdir)) group(root) user(root)"

inherit rpm
