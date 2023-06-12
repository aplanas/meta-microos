SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "python310-augeas-0.5.0-3.17.noarch.rpm"
RPM_HASH = "9bab47aae3e126ae9c6acb34838195cf2c34f866014f720d63c46aef6662a40ce50ac35f0a633fb6d58e2776cf30f91a3f5372b5f98b0547e5088139cc0c88e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-augeas \
python3.10dist(python-augeas) \
python310-augeas \
python3dist(python-augeas)"
RDEPENDS:${PN} += "augeas \
augeas-lenses \
python(abi)"

inherit rpm
