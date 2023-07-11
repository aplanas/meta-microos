SUMMARY = "Headers for fastjet-contrib"
DESCRIPTION = "This package provides the headers for writing code using fastjet-contrib."
LICENSE = "GPL-2.0-only"

PV = "1.049"

RPM_NAME = "fastjet-contrib-devel-1.049-1.4.aarch64.rpm"
RPM_HASH = "05893551b32b3acb54c1520b4e18ae3f5924576481e6266cf8ffcdb5da7ad924244d414bf066b2be618fe0fe5c66cc6aeee47d96af839a951d5f151bc6c1bbb6"

RPROVIDES:${PN} += "fastjet-contrib-devel"

RDEPENDS:${PN} += "libfastjetcontribfragile"

inherit rpm
