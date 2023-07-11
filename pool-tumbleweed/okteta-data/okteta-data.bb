SUMMARY = "Hex Editor data files"
DESCRIPTION = "Data files used by Okteta/libKasten, e.g. structures definitions."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.11"

RPM_NAME = "okteta-data-0.26.11-1.1.noarch.rpm"
RPM_HASH = "0e4ee590e9a0160edad2429685f57cb721db57571d15932c8ae1f9627c093bd0be4cb6bd94f68ffcb7ea17fc817a35366dfb101557003010bca58c55a7953f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteta-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
