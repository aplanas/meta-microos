SUMMARY = "Avocado plugin to propagate job results to ResultsDB"
DESCRIPTION = "Allows Avocado to send job results directly to a ResultsDB \
server."
LICENSE = "GPL-2.0-only"

PV = "69.0"

RPM_NAME = "python3-avocado-plugins-resultsdb-69.0-6.11.noarch.rpm"
RPM_HASH = "6c6a2bcbe621a0f7a9666148591d3c87764ade4af2da1ebe732a23344b9cc4a8e6c0d6f8c4522b3b7de23c455624a1ade47980d2b60962bed32587ec91acb11e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avocado-plugins-resultsdb \
python3.11dist-avocado-framework-plugin-resultsdb \
python3dist-avocado-framework-plugin-resultsdb"

RDEPENDS:${PN} += "python-abi \
python3-avocado \
python3-resultsdb-api"

inherit rpm
