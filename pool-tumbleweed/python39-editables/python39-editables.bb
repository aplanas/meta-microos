SUMMARY = "Editable installations"
DESCRIPTION = "A Python library for creating 'editable wheels' \
 \
This library supports the building of wheels which, when installed, will expose \
packages in a local directory on sys.path in 'editable mode'. In other words, \
changes to the package source will be reflected in the package visible to \
Python, without needing a reinstall."
LICENSE = "MIT"

PV = "0.3"

RPM_NAME = "python39-editables-0.3-2.1.noarch.rpm"
RPM_HASH = "c4b38ee5687c9a66443a0f935571bdcedd4b0582f35cccce892a9a6fd752fe178b5f3955d9043958dc220414aeba101f3127da17f12cff330739d5a0b10db1be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(editables) \
python39-editables \
python3dist(editables)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
