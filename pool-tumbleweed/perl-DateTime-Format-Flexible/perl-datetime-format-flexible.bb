SUMMARY = "DateTime::Format::Flexible - Flexibly parse strings and turn them into D[cut]"
DESCRIPTION = "If you have ever had to use a program that made you type in the date a \
certain way and thought 'Why can't the computer just figure out what date I \
wanted?', this module is for you. \
 \
_DateTime::Format::Flexible_ attempts to take any string you give it and \
parse it into a DateTime object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-DateTime-Format-Flexible-0.34-1.10.noarch.rpm"
RPM_HASH = "d1bccfcd04e00c64286543a0436faec6caed45d0b9be303336b72b6e33193905d8475c4b28e53e59b387916fbca2103a57d91ac447f7b18604bd882e0eded5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Flexible \
perl-DateTime--Format--Flexible--lang \
perl-DateTime--Format--Flexible--lang--de \
perl-DateTime--Format--Flexible--lang--en \
perl-DateTime--Format--Flexible--lang--es \
perl-DateTime-Format-Flexible"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone \
perl-List--MoreUtils"

inherit rpm
