SUMMARY = "Microsoft Azure DigitalTwins Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Digitaltwins Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "6.4.0"

RPM_NAME = "python310-azure-mgmt-digitaltwins-6.4.0-1.2.noarch.rpm"
RPM_HASH = "210c69b6bd2ca1cd3ce0c24d519edf632c8d520b22f608e49c7da7804ae5b72e4ad7baadd61ae594586293e11700257af45b82479420838171c560d9d3887d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-digitaltwins \
python3.10dist(azure-mgmt-digitaltwins) \
python310-azure-mgmt-digitaltwins \
python3dist(azure-mgmt-digitaltwins)"

RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
