SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python310-XStatic-Angular-Schema-Form-0.8.13.0-2.16.noarch.rpm"
RPM_HASH = "7b28a72ffb7f33a99a89e274eca5977a72fbac6b89d333538ad3e021aa705af6875ef6703f38af1565b02ab664d11acbef278edfc8adfea7045bc6b135ab3aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xstatic-angular-schema-form \
python310-XStatic-Angular-Schema-Form \
python3dist-xstatic-angular-schema-form"

RDEPENDS:${PN} += "python-abi"

inherit rpm
