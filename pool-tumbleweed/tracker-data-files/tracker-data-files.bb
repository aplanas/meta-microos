SUMMARY = "Data files for the Tracker Miners"
DESCRIPTION = "Tracker is a desktop-neutral object database, tag/metadata database, \
search tool and indexer. \
 \
This subpackage contains the data files for the Tracker miners."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.3"

RPM_NAME = "tracker-data-files-3.5.3-1.1.noarch.rpm"
RPM_HASH = "134b82693a2282e7a20d17a2ad8d11ee684cc9c04e096720972757b11cc5790a991b061b110a09acd213602ae67304a8cd082d3f3887ff9438996e6510018233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tracker-data-files"

RDEPENDS:${PN} += ""

inherit rpm
