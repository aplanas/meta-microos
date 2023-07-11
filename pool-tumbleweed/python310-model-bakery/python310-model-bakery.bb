SUMMARY = "Smart object creation facility for Django"
DESCRIPTION = "Smart object creation facility for Django."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "python310-model-bakery-1.9.0-1.5.noarch.rpm"
RPM_HASH = "52e2b0191acb5178f1774cee7d28986c4e00fe74028a17ceda3bdedcbcf6a3bf01031af84568d8ceb26dfc52409ed397771d46c4351af6b519f2b783091792cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-model-bakery \
python310-model-bakery \
python3dist-model-bakery"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
