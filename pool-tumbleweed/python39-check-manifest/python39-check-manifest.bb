SUMMARY = "Tool to check Python source package MANIFEST.in for completeness"
DESCRIPTION = "check-manifest is a tool for python developers to check for broken packages \
and missing files in MANIFEST."
LICENSE = "MIT"

PV = "0.49"

RPM_NAME = "python39-check-manifest-0.49-4.3.noarch.rpm"
RPM_HASH = "e38a6acb842cea11e165d8e0d2ba31368bf5d3c0b706c5c4468304b3dbd224b19cb61de48e2fc8bf123593be43ca4800d0b1d962665f2a3eb266c4f6f9742f67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-check-manifest \
python39-check-manifest \
python3dist-check-manifest"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-build \
python39-setuptools \
python39-tomli \
update-alternatives"

inherit rpm
