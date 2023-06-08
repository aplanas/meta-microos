SUMMARY = "A non-interactive script that creates an SSL certificate if it does not exist"
DESCRIPTION = "A script that checks for the existance of an SSL certificate or creates a new self signed one. \
It runs non-interactively and uses either predefined values or automatically guesses the best values. \
 \
Authors: \
-------- \
    J. Daniel Schmidt <jdsn@suse.de>"
LICENSE = "GPL-2.0"

PV = "0.5"

RPM_NAME = "check-create-certificate-0.5-18.16.noarch.rpm"
RPM_HASH = "1b339b79dbb8b987fd10a2112f4c86e1a12f24a32c33796a901d5588044f4875a317b1e7ea5e7ada25875b639fad2c55345a736cc63ed77f7d29d330ab3944a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "check-create-certificate"
RDEPENDS:${PN} += "/usr/bin/perl openssl perl perl-base"

inherit rpm
