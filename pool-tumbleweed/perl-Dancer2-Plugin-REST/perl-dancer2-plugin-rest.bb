SUMMARY = "Plugin for writing RESTful apps with Dancer2"
DESCRIPTION = "This plugin helps you write a RESTful webservice with Dancer2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.02"

RPM_NAME = "perl-Dancer2-Plugin-REST-1.02-1.13.noarch.rpm"
RPM_HASH = "8f61fbaa34b8c20e783c4fedb7e1ececa3eb5e679864cd854211b8c5344790b77d217e4fb7cc19f5d96da26072a36ddb1a9c4b125b4e68ee5c5c78b0d196a5db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Dancer2--Plugin--REST \
perl-Dancer2-Plugin-REST"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Dancer2 \
perl-Dancer2--Core--HTTP \
perl-Dancer2--Plugin \
perl-Dancer2--Serializer--Mutable \
perl-Moo"

inherit rpm
