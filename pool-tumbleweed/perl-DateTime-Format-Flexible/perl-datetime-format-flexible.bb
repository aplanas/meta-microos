SUMMARY = "DateTime::Format::Flexible - Flexibly parse strings and turn them into D[cut]"
DESCRIPTION = "If you have ever had to use a program that made you type in the date a \
certain way and thought 'Why can't the computer just figure out what date I \
wanted?', this module is for you. \
 \
_DateTime::Format::Flexible_ attempts to take any string you give it and \
parse it into a DateTime object."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.34"

RPM_NAME = "perl-DateTime-Format-Flexible-0.34-1.11.noarch.rpm"
RPM_HASH = "9c3ff1241a9a685455937b208e62038d772bedecb9877d46d7adb86a84dba401c3577892e9199edc408d46b3fc3d1c434f8fb8ee1b7c3a49396f4c2c6bc7bc2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DateTime--Format--Flexible \
perl-DateTime--Format--Flexible--lang \
perl-DateTime--Format--Flexible--lang--de \
perl-DateTime--Format--Flexible--lang--en \
perl-DateTime--Format--Flexible--lang--es \
perl-DateTime-Format-Flexible"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-DateTime \
perl-DateTime--Format--Builder \
perl-DateTime--TimeZone \
perl-List--MoreUtils"

inherit rpm
