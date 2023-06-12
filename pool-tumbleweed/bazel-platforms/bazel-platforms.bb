SUMMARY = "Bazel constraint values for specifying platforms and toolchains"
DESCRIPTION = "Bazel platforms contains all canonical constraint_settings, constraint_values \
and platforms that are universally useful across languages and Bazel projects."
LICENSE = "Apache-2.0"

PV = "20190611"

RPM_NAME = "bazel-platforms-20190611-1.10.noarch.rpm"
RPM_HASH = "d88bdef6f322159964d9e3b0cdce87fc52cac553be82a53a8d87b8a5d25e8b84313b0f7bcafd1d5f93164393b42bc6a14ec6b5bf723237fed9b5fabec0d09c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bazel-platforms"
RDEPENDS:${PN} += ""

inherit rpm
