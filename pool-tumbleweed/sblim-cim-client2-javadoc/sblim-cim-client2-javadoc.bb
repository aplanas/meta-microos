SUMMARY = "Javadoc for sblim-cim-client2"
DESCRIPTION = "Javadoc for sblim-cim-client2."
LICENSE = "EPL-1.0"

PV = "2.2.5"

RPM_NAME = "sblim-cim-client2-javadoc-2.2.5-7.4.noarch.rpm"
RPM_HASH = "555316239d3e524aab053fffaa6d8b9bf4835eb0f2ea46bfda824d3d4b9d9c418edc91ee5a65864e082acdab4425ba5656638d846a8ddd894b33ff5b3f953766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sblim-cim-client2-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
