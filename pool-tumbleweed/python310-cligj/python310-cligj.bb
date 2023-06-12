SUMMARY = "Click params for commmand line interfaces to GeoJSON"
DESCRIPTION = "Common arguments and options for GeoJSON processing commands, using Click."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "python310-cligj-0.7.2-1.5.noarch.rpm"
RPM_HASH = "7d3cad71b24926bc8ed95d11903180b78d8842ec33132b44b23e27af7f8a8da0bf6e1e75ae927b203249d795053ce23aab627e64936aa0723000e86ab4583f27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cligj \
python3.10dist(cligj) \
python310-cligj \
python3dist(cligj)"
RDEPENDS:${PN} += "python(abi) \
python310-click"

inherit rpm
