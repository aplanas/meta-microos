SUMMARY = "Version-bump software with a single command"
DESCRIPTION = "A command line tool handling the release process of software by updating all \
version strings in the source code by the correct increment. Also creates \
commits and tags. Version formats are configurable' works without any VCS, but \
can read tag information from and writes commits and tags to Git and Mercurial \
if available; handles text files, so it's not specific to any programming \
language. \
 \
This package obsoletes bumpversion."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python3-bump2version-1.0.1-2.4.noarch.rpm"
RPM_HASH = "1be928d731d414ef0f22e0b03d54881cf1ec173d4034ef93484776d9327bfcd3356220284542915c88d29384d0132fe31bc2d68a223029df21a95830b8a9147d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bump2version \
python3.11dist-bump2version \
python3dist-bump2version"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
