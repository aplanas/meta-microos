SUMMARY = "Tool to list orphaned RPM packages"
DESCRIPTION = "This program finds 'orphaned' packages on the system. It determines \
which packages have no other packages depending on their \
installation, and shows a list of these packages."
LICENSE = "GPL-2.0-or-later"

PV = "1.19"

RPM_NAME = "rpmorphan-1.19-3.10.noarch.rpm"
RPM_HASH = "5acf748d56b52d8c22fd11d2db064dfd778e6d200a87909e02f6d1b8f695cac210f46405f8c71613a0e0c39549db5e268deb2fca76cedd13056aac4ae09c1919"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmorphan \
perl-Tk--CListbox \
perl-Tk--HButton \
perl-Tk--MLColumn \
perl-Tk--MListbox \
rpmorphan"

RDEPENDS:${PN} += "/usr/bin/perl \
rpm"

inherit rpm
