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

RPM_NAME = "python39-python-debian-0.1.49-1.3.noarch.rpm"
RPM_HASH = "64ccc079044bc29167f0d893fcd8bf4ad70ab1ccbb6c29940293a61f2188fc47277f3086b6acf2967bbd7f1495a36a3720503bba41605dabb9efe810338508f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-debian \
python39-debian \
python39-python-debian \
python3dist-python-debian"

RDEPENDS:${PN} += "python-abi \
python39-chardet \
python39-six \
zstd"

inherit rpm
