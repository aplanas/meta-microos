SUMMARY = "Fish Completion for hyperfine"
DESCRIPTION = "The official fish completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.17.0"

RPM_NAME = "hyperfine-fish-completion-1.17.0-1.1.noarch.rpm"
RPM_HASH = "12ce7ba8ceff303ed2f88de60cc7e8d946a3da67622c6cfc173fbbf7e0d43cce036b46292d77c5c0e9df7e297db3414467c1a5e599a0a79abdc0d31781af3c70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
