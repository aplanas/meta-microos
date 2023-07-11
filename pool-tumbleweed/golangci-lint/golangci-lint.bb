SUMMARY = "A fast Go linters runner"
DESCRIPTION = "golangci-lint is a fast Go linters runner. It runs linters in parallel, uses \
caching, supports yaml config, has integrations with all major IDE and has \
dozens of linters included."
LICENSE = "GPL-3.0-only"

PV = "1.53.2"

RPM_NAME = "golangci-lint-1.53.2-1.2.aarch64.rpm"
RPM_HASH = "add3af62febdb0fe259cce4cb91b098c769462ef17f01c7ad7a4caeca2c32cd2b82a2e51ea43d206f41080919bb49c32065a79c6de3505f20db726d668789124"

RPROVIDES:${PN} += "golangci-lint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
