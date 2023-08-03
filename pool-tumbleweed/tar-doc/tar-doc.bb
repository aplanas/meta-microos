SUMMARY = "Documentation files for GNU tar"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-doc-1.34-11.1.noarch.rpm"
RPM_HASH = "6a4bf965d014cc64263de2a176d399d61a18bfad1b7932e0bee18155fa85ca3bd57318380f09c31ed580514c32067818c8690e8e6447e8b46084e91f6acaf2b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tar-doc"

RDEPENDS:${PN} += "tar"

inherit rpm
