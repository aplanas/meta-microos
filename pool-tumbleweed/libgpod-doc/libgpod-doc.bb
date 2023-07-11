SUMMARY = "Documentation for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package provides development documentation for libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-doc-0.8.3-12.7.noarch.rpm"
RPM_HASH = "e321a8405a7facac5490f7a133494eb13f7907299224352993514fc127ab1ff92af8a9faddc4cee1b66eb6c02464ecf84714574ce8c577bf45320dbab37ed17d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgpod-doc"

RDEPENDS:${PN} += ""

inherit rpm
