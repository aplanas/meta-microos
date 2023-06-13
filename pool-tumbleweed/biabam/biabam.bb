SUMMARY = "A Bash Attachment Mailer"
DESCRIPTION = "BIABAM is a small tool, useful when you want to mail attachments from \
the command line. It has similarities to mailing attachments from the \
commandline with Mutt, but it only depends on bash and uuencode."
LICENSE = "GPL-2.0+"

PV = "0.9.7"

RPM_NAME = "biabam-0.9.7-160.10.noarch.rpm"
RPM_HASH = "69a5bacd974b25ee9237aaa948a720a71c8f5346645665c3e268a92c87a400b7aa626c17839b9a6ab79c1a991bc883c19cbb641d252f61e75d4629bde8654d1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "biabam"

RDEPENDS:${PN} += "/bin/bash \
/usr/sbin/sendmail \
sharutils"

inherit rpm
