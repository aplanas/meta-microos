SUMMARY = "Perl Scripts for Mirroring FTP Servers"
DESCRIPTION = "Mirror is a package written in Perl that uses the FTP protocol to duplicate \
a directory hierarchy between the machine it is run on and a remote host. It \
avoids copying files unnecessarily by comparing the file time-stamps and \
file sizes before transferring. Amongst other things, it can optionally \
rename, compress, gzip, and split files."
LICENSE = "SUSE-mirror"

PV = "2.9"

RPM_NAME = "mirror-2.9-910.20.noarch.rpm"
RPM_HASH = "77ebbdf5d1582e66bc11e0b7301d143e400dc40d16044252ad0993b89083321644ac130d5bf6982631311f2d300ee94d4fb074100a33676775ba259781c8c453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mirror"

RDEPENDS:${PN} += "/usr/bin/perl \
perl"

inherit rpm
