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

PV = "2.28.1"

RPM_NAME = "vale-2.28.1-1.1.aarch64.rpm"
RPM_HASH = "d0acffbd0ac4e896b69585a270f506b02f4c77102bbbc022ec181c2624bb8fd42b2037dca7dc126ada70592703f327e6c9e611ae5a33272b32d1e0080d821e25"

RPROVIDES:${PN} += "vale"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
