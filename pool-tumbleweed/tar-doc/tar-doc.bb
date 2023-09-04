SUMMARY = "Documentation files for GNU tar"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-doc-1.34-12.1.noarch.rpm"
RPM_HASH = "5e85ec8120803e1ab93b59e84379f595a6be40e875b03977ae5412002d2436d3387ffbcc69739a081378f2d5145c9055b8b5f6abf1866c16f556a98c9c92e078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tar-doc"

RDEPENDS:${PN} += "tar"

inherit rpm
