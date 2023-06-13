SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python310-XStatic-Angular-Schema-Form-0.8.13.0-2.15.noarch.rpm"
RPM_HASH = "25cc062fcbcf05c2f87d84267e0762aa1c6b5bd4e2e75ed277703f858708fc14c4d8f50e0ea90ce442e8ed24f914f912cc37efa8e732cb82b6087c551ac1c4cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-Angular-Schema-Form \
python3.10dist(xstatic-angular-schema-form) \
python310-XStatic-Angular-Schema-Form \
python3dist(xstatic-angular-schema-form)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
