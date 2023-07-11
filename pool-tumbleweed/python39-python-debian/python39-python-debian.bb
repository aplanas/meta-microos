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

RPM_NAME = "python39-python-debian-0.1.49-1.4.noarch.rpm"
RPM_HASH = "3c55707642046ec01a3e9bab808e36574c0043c50edb8ba75e407cb72d5697d197c551e418f478ced4a263ffbbea71efce9c9e868a0a85170f54938fc2da3c7f"
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
