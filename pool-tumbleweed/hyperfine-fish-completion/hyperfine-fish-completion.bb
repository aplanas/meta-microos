SUMMARY = "Fish Completion for hyperfine"
DESCRIPTION = "The official fish completion script for hyperfine."
LICENSE = "Apache-2.0 | MIT"

PV = "1.17.0"

RPM_NAME = "hyperfine-fish-completion-1.17.0-2.1.noarch.rpm"
RPM_HASH = "596ba531c3788f7584ccf82b4b9f9b0a67e0f66e3ae87ac7773ea665747dc5cd92f41b240a5e8ec03f25957921b418c44bb3aa27741721455417d560071b50e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyperfine-fish-completion"

RDEPENDS:${PN} += ""

inherit rpm
