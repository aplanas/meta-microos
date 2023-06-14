SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python39-check-manifest-0.49-3.1.noarch.rpm"
RPM_HASH = "9b191224d704f9b47b43d389592243245d769fa33fd8411b525504e627d6c8dae21183a5dfde42a9b2d8cd3319f4fe563209eb1b24f2e5547ca3af431f101f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-check-manifest \
python39-check-manifest \
python3dist-check-manifest"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-build \
python39-setuptools \
python39-tomli \
update-alternatives"

inherit rpm
