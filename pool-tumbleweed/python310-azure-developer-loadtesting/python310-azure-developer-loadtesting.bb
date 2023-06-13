SUMMARY = "Microsoft Azure Developer LoadTesting Client Library for Python"
DESCRIPTION = "Microsoft Azure Developer LoadTesting Client Library for Python"
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-developer-loadtesting-1.0.0-1.2.noarch.rpm"
RPM_HASH = "fad6faf64ac932b11b8247ec6d991bf58d1fd5e1e63da75b2b3a40165f9135d45edbba45eb6a9736ea163886241cac00878b36006c531fcacca551a9838b9f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-developer-loadtesting \
python3.10dist(azure-developer-loadtesting) \
python310-azure-developer-loadtesting \
python3dist(azure-developer-loadtesting)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-core \
python310-azure-nspkg \
python310-isodate"

inherit rpm
