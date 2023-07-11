SUMMARY = "Python bindings for musicbrainz NGS webservice"
DESCRIPTION = "This library implements webservice bindings for the Musicbrainz NGS site, also \
known as /ws/2."
LICENSE = "BSD-2-Clause"

PV = "0.7.1"

RPM_NAME = "python310-musicbrainzngs-0.7.1-2.8.noarch.rpm"
RPM_HASH = "6ba78de909bf9bcdb0b18ac9b0d3513e13e04966f487893e53d4b0aa31b1e296dfd89556202bc2353b56496dab2fc4e082003a2edb339eaae86233a6d5ff57bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-musicbrainzngs \
python310-musicbrainzngs \
python3dist-musicbrainzngs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
