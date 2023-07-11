SUMMARY = "Frontend for git-grep and grep"
DESCRIPTION = "vgrep is a command-line tool to search textual patterns in directories. It \
serves as a frontend to grep and git-grep and allows to open the indexed \
matching lines in a user-specified editor. vgrep is inspired by the ancient \
cgvg scripts but extended to perform further operations such as listing \
statistics of files and directory trees or showing the context lines before and \
after the matches."
LICENSE = "GPL-3.0-only"

PV = "2.6.1"

RPM_NAME = "vgrep-2.6.1-1.5.aarch64.rpm"
RPM_HASH = "af44e9e11a91f953ecdc3d9c9cc34e0b8f364e1a8d728c726c32548226b5fac6a2120abf033b9e8b47f5f140be282ade2016cf8f021241056e2d7be8d29f2ed2"

RPROVIDES:${PN} += "vgrep"

RDEPENDS:${PN} += "git-core \
grep"

inherit rpm
