SUMMARY = "A fast Go linters runner"
DESCRIPTION = "golangci-lint is a fast Go linters runner. It runs linters in parallel, uses \
caching, supports yaml config, has integrations with all major IDE and has \
dozens of linters included."
LICENSE = "GPL-3.0-only"

PV = "1.54.2"

RPM_NAME = "golangci-lint-1.54.2-1.1.aarch64.rpm"
RPM_HASH = "030f2ae18fc87e4c43361f8567433febaf2f39c90229fc5b6c0aabccfe34eaf2cae50cc62f177f830c0ea1359cbc1a5b6e9681c46d2511b60c5ada66aac5a635"

RPROVIDES:${PN} += "golangci-lint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
