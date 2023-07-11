SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python39-django-webpack-loader-2.0.1-1.1.noarch.rpm"
RPM_HASH = "9a3f770006a7fecb95438e1d81d826218f35d66ce51b084bcecd5a2aa27b555ae1aa384ab819711f912aba2d8e5f41031210234e3f6c79b447d52f4f7718e50a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-django-webpack-loader \
python39-django-webpack-loader \
python3dist-django-webpack-loader"

RDEPENDS:${PN} += "python-abi \
python39-Django"

inherit rpm
