SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python310-whitenoise-6.2.0-1.5.noarch.rpm"
RPM_HASH = "81cf6681eb4792e7a808b289c539bf5b669db81978b0d1565ddbd9c98888c2995787daa1208e488127c99fabc09360e05cba8519e17cf8e4f5ba7f0ce9c706c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-whitenoise \
python310-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
