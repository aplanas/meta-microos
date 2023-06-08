SUMMARY = "Commandline Tool for Managing File Archives of various Types"
DESCRIPTION = "atool is a script for managing file archives of various types (tar, \
tar+gzip, zip, etc). \
 \
The main command is probably 'aunpack' which extracts files from an \
archive. It overcomes the dreaded 'multiple files in archive root' \
problem by first extracting to a unique subdirectory, and then moving \
back the files if possible. \
 \
aunpack also prevents local files from being overwritten by \
mistake. Other commands provided are apack (for creating archives), \
als (for listing files in archives), and acat (for extracting files to \
stdout)."
LICENSE = "GPL-2.0-or-later"

PV = "0.39.0"

RPM_NAME = "atool-0.39.0-5.10.noarch.rpm"
RPM_HASH = "f478d8abd974c8281978f51c33cd250b423e00182348526a12de85887c01e0b269dede170ac84a6fbb536dc276c348d643e7d765e8e5e4b8dc872afe00294b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atool"
RDEPENDS:${PN} += "/usr/bin/perl bzip2 gzip tar"

inherit rpm
