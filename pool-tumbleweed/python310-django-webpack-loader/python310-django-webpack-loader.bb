SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-django-webpack-loader-2.0.0-1.1.noarch.rpm"
RPM_HASH = "6baef67fb56cac02b039bdce6727399aa6b468b648ca26314809c6030099f3374db56a5bb4b4c00f76b64df0e6fdefb398165139ea3628fba97ec926d2f78b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-webpack-loader \
python3.10dist(django-webpack-loader) \
python310-django-webpack-loader \
python3dist(django-webpack-loader)"

RDEPENDS:${PN} += "python(abi) \
python310-Django"

inherit rpm
