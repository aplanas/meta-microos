SUMMARY = "Python to Debian source package conversion utility"
DESCRIPTION = "The stdeb package produces Debian source packages from Python packages \
via a new distutils command, sdist_dsc. Automatic defaults are provided \
for the Debian package, but many aspects of the resulting package can be \
customized (see the customizing section, below). An additional command, \
bdist_deb, creates a Debian binary package, a .deb file. The install_deb \
command installs this .deb file. The debianize command builds a \
debian/ directory directly alongside your setup.py. \
 \
The openSUSE version does not fail for unmet dependencies in the host \
dpkg database."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python310-stdeb-0.10.0-1.6.noarch.rpm"
RPM_HASH = "d2ca4e7d17e9440dd7c95ffd2c559060636da733f54c631a95c909f90e490fb5d1cbe05c12886f41076fccea049907f7f6ece985933a332f572bf8128f2ee372"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stdeb \
python3.10dist(stdeb) \
python310-stdeb \
python3dist(stdeb)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
debhelper \
dpkg \
fakeroot \
python(abi) \
python310-requests \
update-alternatives"

inherit rpm
