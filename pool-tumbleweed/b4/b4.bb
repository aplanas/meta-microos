SUMMARY = "Helper scripts for kernel.org patches"
DESCRIPTION = "This is a helper utility to work with patches made available via a \
public-inbox archive like lore.kernel.org. It is written to make it \
easier to participate in a patch-based workflows, like those used in \
the Linux kernel development. \
 \
The name 'b4' was chosen for ease of typing and because B-4 was the \
precursor to Lore and Data in the Star Trek universe."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.3"

RPM_NAME = "b4-0.12.3-1.1.noarch.rpm"
RPM_HASH = "c25ddd5f049c8ebc1cb012b79525041a1a13f659e867fef2283b99bf69e1c988950d2b076bda80b6162897f8748d2f8b88fc7a42bad5ee92656876825576ee57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "b4 \
python3.11dist-b4 \
python3dist-b4"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
git-filter-repo \
python-abi \
python3-dkimpy \
python3-dnspython \
python3-patatt \
python3-requests"

inherit rpm
