SUMMARY = "Perl script for easy checking (DNS, common errors and etc.)"
DESCRIPTION = "Sleuth is a perl script designed for easy checking of DNS zones for \
common errors and also for processing of secondary name service \
requests. It was written after examination of at least a dozen of \
utilities claiming to do this job, finding that all of them are either \
unable to discover most zone bugs or too ugly to maintain. Sleuth also \
lists the corresponding RFC references with most of its error messages, \
so that the people upset with their zones being buggy can simply look \
up what is exactly going wrong and how to fix it."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.4"

RPM_NAME = "sleuth-1.4.4-61.8.noarch.rpm"
RPM_HASH = "6d96c9ad94adfbdc24bc14ab2cb46d1f46e1a4af9b25a1e8adb073f6a00dcb78fcd192c84d624fd65be5034c3efdff9b4a5ae1233682a174da706b4c133f857a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(sleuth) \
sleuth"
RDEPENDS:${PN} += "/usr/bin/perl \
perl-Net-DNS"

inherit rpm
