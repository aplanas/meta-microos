SUMMARY = "Debian package related modules"
DESCRIPTION = "This is a collection of modules that are for dealing with Debian related \
data. Currently handled are: \
 \
* Debtags information (debian.debtags module) \
* debian/changelog (debian.changelog module) \
* Packages files, pdiffs (debian.debian_support module) \
* Control files of single or multiple RFC822-style paragraphs, e.g. \
  debian/control, .changes, .dsc, Packages, Sources, Release, etc. \
  (debian.deb822 module) \
* Raw .deb and .ar files, with (read-only) access to contained \
  files and meta-information"
LICENSE = "GPL-3.0-or-later"

PV = "0.1.49"

RPM_NAME = "python310-python-debian-0.1.49-1.3.noarch.rpm"
RPM_HASH = "ea5cfa67c0f535bd375e684498c51ea3f95f94bdd155daa0b1db4b8e3d67964e72662b3f01892e65727c80266a735b855967788870f9f47c82ee184a3c7ca8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-debian \
python3-python-debian \
python3.10dist(python-debian) \
python310-debian \
python310-python-debian \
python3dist(python-debian)"

RDEPENDS:${PN} += "python(abi) \
python310-chardet \
python310-six \
zstd"

inherit rpm
