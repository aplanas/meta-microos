SUMMARY = "Microsoft Azure CustomProviders Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure CustomProviders Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-customproviders-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "07b835da3a2755f124a9f741d3dbbd0fd834c81df20aa95204eab11d2bfd44dedf25f84ad1d2a0663706f7b0598b81a1352eb26e484f32d5f08241c98c704957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-customproviders) \
python39-azure-mgmt-customproviders \
python3dist(azure-mgmt-customproviders)"

RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
