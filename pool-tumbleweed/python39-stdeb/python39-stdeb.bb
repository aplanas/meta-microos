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

RPM_NAME = "python39-stdeb-0.10.0-1.7.noarch.rpm"
RPM_HASH = "117b4873ab685851c2941cc0e33d11f90ba08108a89d76619534e96474082d1a8cc6ef30100f8aa29fcbc18b5db169e4a6a1c89df0d9313780ed0c4a94e244f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-stdeb \
python39-stdeb \
python3dist-stdeb"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
debhelper \
dpkg \
fakeroot \
python-abi \
python39-requests \
update-alternatives"

inherit rpm
