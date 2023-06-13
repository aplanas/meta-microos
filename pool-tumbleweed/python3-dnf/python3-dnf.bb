SUMMARY = "Python 3 interface to DNF"
DESCRIPTION = "This package provides the Python 3 interface to DNF."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "python3-dnf-4.14.0-3.1.noarch.rpm"
RPM_HASH = "22a1c7da52b4aab6c4dca1c5004bd8ca8b70dca945f7b625b27b9868bbc6313d407981d49b4a8effdd1e209292bab953ac8cfb2a9e1d48218412908e695115de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dnf"

RDEPENDS:${PN} += "/usr/bin/python3 \
deltarpm \
dnf-data \
python(abi) \
python3-curses \
python3-gpg \
python3-hawkey \
python3-libcomps \
python3-libmodulemd \
python3-rpm"

inherit rpm
