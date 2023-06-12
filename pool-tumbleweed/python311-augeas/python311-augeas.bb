SUMMARY = "Python bindings for Augeas"
DESCRIPTION = "Python bindings for Augeas, a library for programmatically editing \
configuration files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.5.0"

RPM_NAME = "python311-augeas-0.5.0-3.17.noarch.rpm"
RPM_HASH = "f6ba5df40dad7a3210d38214af73ec4a68eea1978a8759c757575e755046739a1c52db95685f7cf746338fb5db8da3258e3b92903b3c5ff18ecbc3945ce04bbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(python-augeas) \
python311-augeas \
python3dist(python-augeas)"
RDEPENDS:${PN} += "augeas \
augeas-lenses \
python(abi)"

inherit rpm
