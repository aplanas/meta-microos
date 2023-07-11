SUMMARY = "Django plugin to transparently use webpack"
DESCRIPTION = "webpack can be used to generate static bundles without Django's \
staticfiles or opaque wrappers."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python310-django-webpack-loader-2.0.1-1.1.noarch.rpm"
RPM_HASH = "96812d46e3d6499c979d838084002c55e8db6f4060f78393dceaa43af79504064729caf736ed3077d8b834587d20bfb4572754eb03e179235658adf94e2c704f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-django-webpack-loader \
python310-django-webpack-loader \
python3dist-django-webpack-loader"

RDEPENDS:${PN} += "python-abi \
python310-Django"

inherit rpm
