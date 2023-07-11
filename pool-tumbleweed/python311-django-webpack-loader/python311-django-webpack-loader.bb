SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-django-webpack-loader-2.0.1-1.1.noarch.rpm"
RPM_HASH = "96fefbd45398d8a01bb9e6b086ed58625ccf9af4f37827c7cd54ed6fe002221f60073fa83f39b8b29c9b790580417c3cb466678ff2b5fc6a9464a46ea1e5327b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-django-webpack-loader \
python3.11dist-django-webpack-loader \
python311-django-webpack-loader \
python3dist-django-webpack-loader"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
