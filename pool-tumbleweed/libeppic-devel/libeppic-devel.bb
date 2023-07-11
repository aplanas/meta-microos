SUMMARY = "EPPIC include files and libraries"
DESCRIPTION = "EPPIC is a C interpreter that permits easy access to the symbol and type \
information stored in a executable image like a coredump or live memory \
interfaces (e.g. /dev/kmem, /dev/mem). Although it has a strong association \
with live or postmortem kernel analysis, it is not constraint to it and can be \
embedded in any tools that is C friendly. \
 \
This package provides the include files and libraries needed for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.99.git.1682279748.c294e5b"

RPM_NAME = "libeppic-devel-4.99.git.1682279748.c294e5b-1.2.aarch64.rpm"
RPM_HASH = "0b262f80b0bc15009103335aa432d0e7eb9fe9d404bb937ce18a6b617900e70492a1d3ead9bf8288cea0c3da75f07844f76a46b780f2931c702913b405a3f9db"

RPROVIDES:${PN} += "libeppic-devel"

RDEPENDS:${PN} += ""

inherit rpm
