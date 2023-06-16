SUMMARY = "A Python package management system"
DESCRIPTION = "Pip is a replacement for pip. It uses mostly the same techniques for \
finding packages, so packages that were made pipable should be \
pip-installable as well."
LICENSE = "MIT"

PV = "20.0.2"

RPM_NAME = "python2-pip-20.0.2-3.5.noarch.rpm"
RPM_HASH = "e4fea6d236ae4c4ed68baf5308a2478cb6e9c1413e37199f44f7b99578538cf67090d531a9bc47a311b5dd614a66cd886f094e6ebec2aff4a80cf0ddc3af6765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python2-pip"

RDEPENDS:${PN} += "/usr/bin/python2 \
/usr/bin/sh \
ca-certificates \
coreutils \
python2-setuptools \
update-alternatives"

inherit rpm
