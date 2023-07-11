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

RPM_NAME = "python310-stdeb-0.10.0-1.7.noarch.rpm"
RPM_HASH = "64555226d64e1856385ecbdd9da8b058c1d0404df0b6e45b395ec03b10e30383e073d5ef481901f0bf57f7b3310ca89e6a547c3a8815b19fb7e58be8548b4361"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-stdeb \
python310-stdeb \
python3dist-stdeb"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
debhelper \
dpkg \
fakeroot \
python-abi \
python310-requests \
update-alternatives"

inherit rpm
