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

RPM_NAME = "python311-stdeb-0.10.0-1.7.noarch.rpm"
RPM_HASH = "5c45b0a4a9829777c2c925e59d08e5ffedd577005143a40b427ce73895af15c7a66c1384e34f2d9cceafce939c2d3fef5d2b7d36b40f1e0cb30472ac7ebae8eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-stdeb \
python3.11dist-stdeb \
python311-stdeb \
python3dist-stdeb"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
debhelper \
dpkg \
fakeroot \
python-abi \
python311-requests \
update-alternatives"

inherit rpm
