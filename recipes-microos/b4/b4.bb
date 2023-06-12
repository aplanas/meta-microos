SUMMARY = "Helper scripts for kernel.org patches"
DESCRIPTION = "This is a helper utility to work with patches made available via a \
public-inbox archive like lore.kernel.org. It is written to make it \
easier to participate in a patch-based workflows, like those used in \
the Linux kernel development. \
 \
The name 'b4' was chosen for ease of typing and because B-4 was the \
precursor to Lore and Data in the Star Trek universe."
LICENSE = "GPL-2.0-or-later"

PV = "0.12.2"

RPM_NAME = "b4-0.12.2-1.3.noarch.rpm"
RPM_HASH = "f7c17d69a7fd8c81468453906eaee387168710ee26637cc7e7f1d70a3499b098bda8396b5cfe1c8386b230ab42973f42ca828f62735fbc5f2143059ea5e332ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "b4 \
python3.10dist(b4) \
python3dist(b4)"
RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
git-filter-repo \
python(abi) \
python3-dkimpy \
python3-dnspython \
python3-patatt \
python3-requests"

inherit rpm
