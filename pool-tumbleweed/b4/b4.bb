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

RPM_NAME = "b4-0.12.3-2.1.noarch.rpm"
RPM_HASH = "cc0195a84541ffce477650c58993e4c0408346f1108c51f55310a3f29d071ee2fc9c2203e82f3b160c62d9d547b54c4204971b0b14f77476c91a292d049a6423"
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
