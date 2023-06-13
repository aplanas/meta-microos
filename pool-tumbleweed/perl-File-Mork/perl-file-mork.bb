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

RPM_NAME = "perl-File-Mork-0.4-2.21.noarch.rpm"
RPM_HASH = "8c98e47e793d2fe55b113492edac5415c56a00aa88cbf6b56609bf5c62a37784846347fd517d829c6af71f6f5531e44ef026c78a8484da043c2e5a4d1a276441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(File::Mork) \
perl(File::Mork::Entry) \
perl-File-Mork"

RDEPENDS:${PN} += "/usr/bin/perl \
perl(:MODULE_COMPAT_5.36.0) \
perl(HTML::Entities)"

inherit rpm
