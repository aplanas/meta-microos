SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "python39-fastimport-0.9.14-2.2.noarch.rpm"
RPM_HASH = "26aa9b53d4e87bc25f63ffff3ec81507d2838269078f9e9a13dc57e510cbe3db0bf8b81dbc008c0b759a5d53208ee1286be24e93fe7fe6a331b67073067dcd7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fastimport \
python39-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
