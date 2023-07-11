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

RPM_NAME = "python311-python-debian-0.1.49-1.4.noarch.rpm"
RPM_HASH = "313d4d841239742146356ddb225f6d6abb29ab6dc222f413d29aa65a21a7f13318c712bba621b980fb6b652ecc37604271eed7c1c46aa797819417f6c41d1c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-debian \
python3-python-debian \
python3.11dist-python-debian \
python311-debian \
python311-python-debian \
python3dist-python-debian"

RDEPENDS:${PN} += "python-abi \
python311-chardet \
python311-six \
zstd"

inherit rpm
