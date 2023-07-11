SUMMARY = "Easy MIME message handling"
DESCRIPTION = "This is an extension of the Email::Simple module, to handle MIME encoded \
messages. It takes a message as a string, splits it up into its constituent \
parts, and allows you access to various parts of the message. Headers are \
decoded from MIME encoding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.953"

RPM_NAME = "perl-Email-MIME-1.953-1.2.noarch.rpm"
RPM_HASH = "16d8c1351a16bd1f537e45e000fc2f91650cd2028ed38346871cd123b128e388c5f034bf6ed82afbd8260e354ffaee4910b1171018b7c01d272b4b054edce140"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME \
perl-Email--MIME--Creator \
perl-Email--MIME--Encode \
perl-Email--MIME--Header \
perl-Email--MIME--Header--AddressList \
perl-Email--MIME--Modifier \
perl-Email-MIME"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Email--Address--XS \
perl-Email--MIME--ContentType \
perl-Email--MIME--Encodings \
perl-Email--MessageID \
perl-Email--Simple \
perl-Email--Simple--Creator \
perl-Email--Simple--Header \
perl-MIME--Types \
perl-Module--Runtime \
perl-parent"

inherit rpm
