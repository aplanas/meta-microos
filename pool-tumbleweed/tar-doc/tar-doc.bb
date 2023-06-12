SUMMARY = "Documentation files for GNU tar"
DESCRIPTION = "GNU Tar is an archiver program. It is used to create and manipulate files \
that are actually collections of many other files; the program provides \
users with an organized and systematic method of controlling a large amount \
of data. Despite its name, that is an acronym of 'tape archiver', GNU Tar \
is able to direct its output to any available devices, files or other programs, \
it may as well access remote devices or files."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-doc-1.34-10.3.noarch.rpm"
RPM_HASH = "d47678759f5159f9ada10c1adca0d06baa8e3fa8f81bcac415c80f06b6f48435b18907f91d785f5907d5b1d50c3c482f09533160d7799e5f06960b53ce0bee04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tar-doc"
RDEPENDS:${PN} += "tar"

inherit rpm
