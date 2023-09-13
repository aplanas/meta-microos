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

PV = "2.28.3"

RPM_NAME = "vale-2.28.3-1.1.aarch64.rpm"
RPM_HASH = "4888de298103174bdae1961ff36876c114da01af9a60df8cba65016ef6c320a9806f037cdb4553349f27dba12a411f35c2f34a6780cb915f2b3294990bad334b"

RPROVIDES:${PN} += "vale"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
