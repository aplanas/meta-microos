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

RPM_NAME = "python310-azure-agrifood-farming-1.0.0b2-1.4.noarch.rpm"
RPM_HASH = "d4dd89c264c3611f2f74138234b46240f23f7c0fde3ff2d7c74aeffd8131e9267dfbceeeffceecd0ca6b6fbf0c8c48a7d64d6ae29c4e9737678ed1b59274d20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-azure-agrifood-farming \
python310-azure-agrifood-farming \
python3dist-azure-agrifood-farming"

RDEPENDS:${PN} += "python-abi \
python310-azure-agrifood-nspkg \
python310-azure-core \
python310-azure-nspkg \
python310-msrest \
python310-six"

inherit rpm
