SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python311-XStatic-Angular-Schema-Form-0.8.13.0-2.16.noarch.rpm"
RPM_HASH = "d05328501d1c32bc614f0dbc163f1aaf06f466a6b47b30f7b78031b602667695f67a03b5f8bc9b79124de97a9598e2e3347da6e09efdc448007cdec4f0828bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-Angular-Schema-Form \
python3.11dist-xstatic-angular-schema-form \
python311-XStatic-Angular-Schema-Form \
python3dist-xstatic-angular-schema-form"

RDEPENDS:${PN} += "python-abi"

inherit rpm
