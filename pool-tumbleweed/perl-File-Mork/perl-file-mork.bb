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

RPM_NAME = "perl-File-Mork-0.4-2.23.noarch.rpm"
RPM_HASH = "80e6f6f4bf4018152264aa34247a7e266ea2da2d1acf6fa8db95562e84e80601a569b7a96c4ffa17342a2e1c6dd18f98f55e3169cda157e57b54764c7dce67dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Mork \
perl-File--Mork--Entry \
perl-File-Mork"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-HTML--Entities"

inherit rpm
