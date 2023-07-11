SUMMARY = "A standard input word picker"
DESCRIPTION = "This tool reads words from a file or standard input, presents them in an \
interactive window after the current line on the terminal, and writes the \
selected words, if any, to standard output."
LICENSE = "GPL-2.0-only"

PV = "1.2.0"

RPM_NAME = "smenu-1.2.0-1.4.aarch64.rpm"
RPM_HASH = "23b8003e12b7322f904852e3b21b2f8c240dda3f18721eb46c6065aa817782878594ccddff9caa323eb8f7363b7ee3cc18309eff80f10c5d108c6df6a76c6299"

RPROVIDES:${PN} += "smenu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtinfo.so.6"

inherit rpm
