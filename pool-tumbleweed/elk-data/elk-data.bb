SUMMARY = "Common data files for use with elk"
DESCRIPTION = "This package provides common data files for use with any flavour of \
elk."
LICENSE = "GPL-3.0-or-later"

PV = "8.7.2"

RPM_NAME = "elk-data-8.7.2-1.4.noarch.rpm"
RPM_HASH = "eade2a47996f79a0cfcb2009eb3bf60844d6ff97ef289f3b7b5ab1a31668293f6610f901f3c3b8a738043f4ba583e0a7dcd79c81f2cec65bd4406684f094c6de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "elk-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
