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

RPM_NAME = "python310-python-debian-0.1.49-1.4.noarch.rpm"
RPM_HASH = "b6e737b71c7f3e7aae68955f8196eb041f983bb4a81b804435117f888f4139b2dbc5ffe455b57dfffc57959477660728d0e5b9cdfae2d149d250024e496ce103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-debian \
python310-debian \
python310-python-debian \
python3dist-python-debian"

RDEPENDS:${PN} += "python-abi \
python310-chardet \
python310-six \
zstd"

inherit rpm
