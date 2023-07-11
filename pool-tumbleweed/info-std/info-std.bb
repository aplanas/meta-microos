SUMMARY = "The info pages of the Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.0.3"

RPM_NAME = "info-std-7.0.3-1.3.noarch.rpm"
RPM_HASH = "ba7b9cf06ad17d5c86dc0a7fccceabc446351e4713f43ed122890428e02d3aae5b4f3d50750230c2c29d9c2b56f65feb233d778c9ad5b64df40c61b94d20b687"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "info-std"

RDEPENDS:${PN} += ""

inherit rpm
