SUMMARY = "Reply to an Email Message"
DESCRIPTION = "This software takes the hard out of generating replies to email messages."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.204"

RPM_NAME = "perl-Email-Reply-1.204-1.20.noarch.rpm"
RPM_HASH = "30f670a32bc1b931c5dc874031e528164f084c70597ffff46ca327ff7c532fa29788940fad7d18261db1e0d5b2f446a93fc97be1daf5f2b2b32d95c11cc5d572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Reply \
perl-Email-Reply"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Email--Abstract \
perl-Email--Address \
perl-Email--MIME"

inherit rpm
