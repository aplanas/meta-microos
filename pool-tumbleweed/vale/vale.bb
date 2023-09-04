SUMMARY = "CLI tool to lint prose text with syntax awareneness and extensible markup format support"
DESCRIPTION = "Vale is a command-line tool that brings code-like linting to prose. It's fast, \
cross-platform (Windows, macOS, and Linux), and highly customizable. \
 \
Vale has support for markup: Vale has a rich understanding of many markup \
formats, allowing it to avoid syntax-related false positives and intelligently \
exclude code snippets from prose-related rules. \
 \
Vale includes a highly customizable extension system capable of enforcing your \
style-be it a standard editorial style guide or a custom in-house set of rules \
(such as those created by GitLab, Homebrew, Linode, CockroachDB, and Spotify). \
 \
https://vale.sh/"
LICENSE = "MIT"

PV = "2.28.2"

RPM_NAME = "vale-2.28.2-1.1.aarch64.rpm"
RPM_HASH = "d38f256477d4610c6f0e8860794d6d7ccd367d8dea30526baefac5c82742bddb3725b148dc8663a51424e03af236486b6c0e68c525f32e19963b1f9e1e493d95"

RPROVIDES:${PN} += "vale"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
