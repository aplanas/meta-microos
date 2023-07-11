SUMMARY = "Module to Read Mozilla Url History Files"
DESCRIPTION = "This is a module that can read the Mozilla URL history file -- normally \
$HOME/.mozilla/default/*.slt/history.dat -- and extract the id, url, name, \
hostname, first visted dat, last visited date and visit count. \
 \
To find your history file it might be worth using *Mozilla::Backup* which \
has some platform-independent code for finding the profiles of various \
Mozilla-isms (including Firefox, Camino, K-Meleon, etc.)."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "perl-File-Mork-0.4-2.22.noarch.rpm"
RPM_HASH = "1f572112c233e63f58d427a566fb7fdc8b3174086a1dff916c2e26017e0c85066c4f301b9ee1ca8bc93da79ea7a3b22a89faf784cbf890a7204dfdc48db8116c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Mork \
perl-File--Mork--Entry \
perl-File-Mork"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-HTML--Entities"

inherit rpm
