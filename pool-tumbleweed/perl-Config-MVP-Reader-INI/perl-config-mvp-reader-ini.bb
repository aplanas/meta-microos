SUMMARY = "An MVP config reader for .ini files"
DESCRIPTION = "Config::MVP::Reader::INI reads _.ini_ files containing MVP-style \
configuration."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.101465"

RPM_NAME = "perl-Config-MVP-Reader-INI-2.101465-1.4.noarch.rpm"
RPM_HASH = "b9edde226c833e14432e7a07110cd0a8a0067345b98a34eb20f673a994232844f81b6550af3d668dd0324d55eb7c0a9f42f0af886bb171328674d7f450d19b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MVP--Reader--INI \
perl-Config-MVP-Reader-INI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Config--INI--Reader \
perl-Config--MVP \
perl-Config--MVP--Reader \
perl-Config--MVP--Reader--Findable--ByExtension \
perl-Moose \
perl-parent"

inherit rpm
