SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-django-webpack-loader-2.0.0-1.1.noarch.rpm"
RPM_HASH = "632b600a159fa39c1d196fc21d50d489ccc6fbc6af9e99631879da1c79c251650b9012863e44876bbde20e93128b1702649c86545d8edfd0bc800c81891dcee0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-django-webpack-loader \
python311-django-webpack-loader \
python3dist-django-webpack-loader"

RDEPENDS:${PN} += "python-abi \
python311-Django"

inherit rpm
