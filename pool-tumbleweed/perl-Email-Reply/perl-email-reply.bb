SUMMARY = "Reply to an Email Message"
DESCRIPTION = "This software takes the hard out of generating replies to email messages."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.204"

RPM_NAME = "perl-Email-Reply-1.204-1.22.noarch.rpm"
RPM_HASH = "900c05a2c1f6096271122f844d15966222d51fbf477925adb9ff3ae8da390afff7d8e8393727b7935a550a4d0741fb1254d1a5de832eeb2214836c1ff54b0292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Reply \
perl-Email-Reply"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Email--Abstract \
perl-Email--Address \
perl-Email--MIME"

inherit rpm
