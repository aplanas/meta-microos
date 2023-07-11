SUMMARY = "Plugin for writing RESTful apps with Dancer2"
DESCRIPTION = "This plugin helps you write a RESTful webservice with Dancer2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Dancer2-Plugin-REST-1.02-1.12.noarch.rpm"
RPM_HASH = "4f506085e69446a93f804023ef71befbea29a5ce045009a9cb37f7f8d8ac0189135fe69592560c66191d70849641335e1c7b9b5ca6c57daa796d159565d833d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--REST \
perl-Dancer2-Plugin-REST"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Dancer2 \
perl-Dancer2--Core--HTTP \
perl-Dancer2--Plugin \
perl-Dancer2--Serializer--Mutable \
perl-Moo"

inherit rpm
