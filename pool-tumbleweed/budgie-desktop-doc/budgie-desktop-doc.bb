SUMMARY = "Documentation files for the Budgie Desktop"
DESCRIPTION = "This package provides API Documentation for the Budgie Plugin API, in the \
GTK-Doc HTML format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "budgie-desktop-doc-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "46cf8637f713796dc60d0325d9f87cdb4f5d5015e9001caa98b55d82bb13acb53c25b9165349dba4ca3f6a622cf7691f8a13ebd94c9c7525669c24a9ddbb33a1"

RPROVIDES:${PN} += "budgie-desktop-doc"

RDEPENDS:${PN} += ""

inherit rpm
