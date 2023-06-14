SUMMARY = "Python library for .env support"
DESCRIPTION = "Add .env support to your Django/Flask apps in development and deployments."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python311-python-dotenv-1.0.0-1.1.noarch.rpm"
RPM_HASH = "16a61ebf8dda7551588a366d62adb6c238ce58b116c4490c7f9065c0cf231857391247c65c28901babe849752f3e5017a88b8db1c39be170caa89bac9ee6e724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-dotenv \
python311-python-dotenv \
python3dist-python-dotenv"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-click \
update-alternatives"

inherit rpm
