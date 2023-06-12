SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "python39-augeas-0.5.0-3.17.noarch.rpm"
RPM_HASH = "29652f5c6129345b66e81fedf7b3e02597df877af3446205d79e9e5fef7d330e28200607370cbe6a6b2188a9bc0331100dc5cf23a02655e809d8a0e4301a8b71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-augeas) \
python39-augeas \
python3dist(python-augeas)"
RDEPENDS:${PN} += "augeas \
augeas-lenses \
python(abi)"

inherit rpm
