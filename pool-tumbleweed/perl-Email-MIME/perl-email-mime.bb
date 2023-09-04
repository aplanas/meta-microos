SUMMARY = "Easy MIME message handling"
DESCRIPTION = "This is an extension of the Email::Simple module, to handle MIME encoded \
messages. It takes a message as a string, splits it up into its constituent \
parts, and allows you access to various parts of the message. Headers are \
decoded from MIME encoding."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.953"

RPM_NAME = "perl-Email-MIME-1.953-1.3.noarch.rpm"
RPM_HASH = "899019fe3460dd8e9edf65787a4e52590ea072fd601e8d00714321ab89ad964a182864c3279f6fc5fd4a3ca54d815f0ca385098c4d3f796cc5854a6383d24ead"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MIME \
perl-Email--MIME--Creator \
perl-Email--MIME--Encode \
perl-Email--MIME--Header \
perl-Email--MIME--Header--AddressList \
perl-Email--MIME--Modifier \
perl-Email-MIME"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
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
