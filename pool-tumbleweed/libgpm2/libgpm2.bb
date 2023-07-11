SUMMARY = "Console mouse support library"
DESCRIPTION = "This package provides a library that handles mouse requests and \
delivers them to applications. See the description for the 'gpm' \
package for more information."
LICENSE = "GPL-2.0-or-later"

PV = "1.20.7"

RPM_NAME = "libgpm2-1.20.7-19.15.aarch64.rpm"
RPM_HASH = "85f33fa8fa730e21fcfac2ef20ebd7bc32c7832a2e057a411bef0a48196219dc91ba6ffd21779ba589f9cbd849b1b760ab710860fbcf04608ac1bb6ab2fa4388"

RPROVIDES:${PN} += "libgpm.so.2 \
libgpm2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
