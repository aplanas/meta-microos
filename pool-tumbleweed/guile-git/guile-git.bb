SUMMARY = "Guile bindings of libgit2"
DESCRIPTION = "This package provides Guile bindings to libgit2, \
a library manipulate repositories of the Git version control system."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.2"

RPM_NAME = "guile-git-0.5.2-1.3.aarch64.rpm"
RPM_HASH = "402b9990cd0c73fa16458946271a39b4a4d4f4453e44209e26dbf89e28586aa1e3ce386c93c31aeaffea6ef8e9aacaf461cbf27e7db458df8249ea2ad5d89f94"

RPROVIDES:${PN} += "guile-git"

RDEPENDS:${PN} += "/usr/bin/sh \
guile \
guile-bytestructures \
libgit2-devel"

inherit rpm
