SUMMARY = "Documentation files for GNU tar"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-doc-1.34-10.4.noarch.rpm"
RPM_HASH = "23bc20eb6583bb9a8e061192b25aaf6db300b2c5c5733e617bdc30e4ff6a1dfc332998f4b03a9bbcfd18e5792b9e30fed24183abeb249e81462301b6657088d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tar-doc"

RDEPENDS:${PN} += "tar"

inherit rpm
