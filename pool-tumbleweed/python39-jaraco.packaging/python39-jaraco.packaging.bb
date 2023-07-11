SUMMARY = "Supplement packaging Python releases"
DESCRIPTION = "Tools to supplement packaging Python releases."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python39-jaraco.packaging-9.2.0-1.3.noarch.rpm"
RPM_HASH = "0df515195dd27c220285deca566bfa8378c83ec05368dde980b70e01b373363cb5e515e20223dd64d76fdb60ed172b8552208fc8b644245249550ecf068bf8ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jaraco.packaging \
python39-jaraco.packaging \
python3dist-jaraco.packaging"

RDEPENDS:${PN} += "python-abi \
python39-build \
python39-jaraco.context \
python39-virtualenv"

inherit rpm
