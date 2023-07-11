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

PV = "2.28.0"

RPM_NAME = "vale-2.28.0-1.1.aarch64.rpm"
RPM_HASH = "91565df8c58d30b6a0b84961e4ebe4b516fbf09bd6f027a99dc92b0d2fc3ea9e40faee064530bccb806d928e7497e6e6ddb752491a2325270b01dc054b1f417c"

RPROVIDES:${PN} += "vale"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
