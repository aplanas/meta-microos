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

PV = "2.27.0"

RPM_NAME = "vale-2.27.0-1.1.aarch64.rpm"
RPM_HASH = "0804a11f06eb61e124e8d2133c3a4cacdb2d1ef3c041c3a7e08f70e5f813e8d4b1cfaad244ab2cb0959e55d317ccd4899596cb3c1e70fd28f008c9ca540b124f"

RPROVIDES:${PN} += "vale \
vale(aarch-64)"

RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
