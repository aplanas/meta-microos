SUMMARY = "Reply to an Email Message"
DESCRIPTION = "This software takes the hard out of generating replies to email messages."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.204"

RPM_NAME = "perl-Email-Reply-1.204-1.21.noarch.rpm"
RPM_HASH = "455aa9e0758aeca424b0b18617837efa1d35dbe99e482774496713a0fdbc2576e50100adfa7f0952e51b60690f5409de8b1ea8a58cfaf7ead16ef5751389d0ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Reply \
perl-Email-Reply"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Email--Abstract \
perl-Email--Address \
perl-Email--MIME"

inherit rpm
