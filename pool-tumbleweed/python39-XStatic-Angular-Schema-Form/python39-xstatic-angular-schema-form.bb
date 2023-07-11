SUMMARY = "AngularJS library 'schema-form' repackaged for the XStatic standard"
DESCRIPTION = "Angular JavaScript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.8.13.0"

RPM_NAME = "python39-XStatic-Angular-Schema-Form-0.8.13.0-2.16.noarch.rpm"
RPM_HASH = "d838f80c25711870e48ed99d7b76be77d78c0a4ce8c528c644092c4370bfd0c94d6a559faf205fd031115805187b1eb358e7175e8eda93aa1e82574de8ca4241"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xstatic-angular-schema-form \
python39-XStatic-Angular-Schema-Form \
python3dist-xstatic-angular-schema-form"

RDEPENDS:${PN} += "python-abi"

inherit rpm
