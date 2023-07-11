SUMMARY = "Microsoft Azure AgriFood Farming client library"
DESCRIPTION = "FarmBeats is a B2B PaaS offering from Microsoft that makes it easy for AgriFood companies \
to build intelligent digital agriculture solutions on Azure. FarmBeats allows users to \
acquire, aggregate, and process agricultural data from various sources (farm equipment, \
weather, satellite) without the need to invest in deep data engineering resources. Customers \
can build SaaS solutions on top of FarmBeats and leverage first class support for model \
building to generate insights at scale. \
 \
Use FarmBeats client library for Python to do the following. \
 \
 * Create & update farmers, farms, fields, seasonal fields and boundaries. \
 * Ingest satellite and weather data for areas of interest. \
 * Ingest farm operations data covering tilling, planting, harvesting \
   and application of farm inputs."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-agrifood-farming-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "eae6b6d0b7d95522bab3b3a0813c68d29869f5f6e280a78c034ee7c4fe3fb9646961d9ff61db316ed614362bc6ec53c9fe3e746b976e5b985a43757c3a69dd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-agrifood-farming \
python3.11dist-azure-agrifood-farming \
python311-azure-agrifood-farming \
python3dist-azure-agrifood-farming"

RDEPENDS:${PN} += "python-abi \
python311-azure-agrifood-nspkg \
python311-azure-core \
python311-azure-nspkg \
python311-msrest \
python311-six"

inherit rpm
