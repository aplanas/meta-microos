SUMMARY = "Static file serving for WSGI applications"
DESCRIPTION = "Static file serving for WSGI applications."
LICENSE = "MIT"

PV = "6.2.0"

RPM_NAME = "python39-whitenoise-6.2.0-2.1.noarch.rpm"
RPM_HASH = "0991df4321e988db8b2cf82165282f515e6658cdeaddaf193693957409377a803cf75147b072822e85fc9be2dc2dfa523107039a040e6fb60ef3b40c6c991f1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-whitenoise \
python39-whitenoise \
python3dist-whitenoise"

RDEPENDS:${PN} += "python-abi"

inherit rpm
