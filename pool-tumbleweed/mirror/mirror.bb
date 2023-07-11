SUMMARY = "Perl Scripts for Mirroring FTP Servers"
DESCRIPTION = "Mirror is a package written in Perl that uses the FTP protocol to duplicate \
a directory hierarchy between the machine it is run on and a remote host. It \
avoids copying files unnecessarily by comparing the file time-stamps and \
file sizes before transferring. Amongst other things, it can optionally \
rename, compress, gzip, and split files."
LICENSE = "SUSE-mirror"

PV = "2.9"

RPM_NAME = "mirror-2.9-910.19.noarch.rpm"
RPM_HASH = "69032d7bdd5dc6de5d419ade8ce5782a58c4b056500ee2767186b0ee5217388085056a2775a7d9cd58cb6aa29198808e23da5b884927719e715390031c7a52a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mirror"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
