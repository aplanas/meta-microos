SUMMARY = "Fastimport parser in Python"
DESCRIPTION = "This is the Python parser that was originally developed for \
bzr-fastimport, but extracted so it can be used by other projects. \
 \
It is currently used by bzr-fastimport and dulwich. hg-fastimport and \
git-remote-hg use a slightly modified version of it."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.14"

RPM_NAME = "python311-fastimport-0.9.14-2.2.noarch.rpm"
RPM_HASH = "4c98bb061bb80f626af7faf0e34fea476b5499011eb1774d329c274a6fa9e4bc0e5a9bbb2754c39bc15f9f0aa65b1bf1832e65adb9e592e5f65d830c6e948986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fastimport \
python3.11dist-fastimport \
python311-fastimport \
python3dist-fastimport"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
