SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python39-XStatic-Angular-Schema-Form-0.8.13.0-2.15.noarch.rpm"
RPM_HASH = "88385c437b42deb98eff9d4d176ad3500fcd308b56ac9262deef483c6e32c2f0712ea3a9020ea702557431cda029cd8127144ba760fc409ad9f12976a328ca03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xstatic-angular-schema-form) \
python39-XStatic-Angular-Schema-Form \
python3dist(xstatic-angular-schema-form)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
