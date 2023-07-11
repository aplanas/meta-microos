SUMMARY = "An MVP config reader for .ini files"
DESCRIPTION = "Config::MVP::Reader::INI reads _.ini_ files containing MVP-style \
configuration."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.101465"

RPM_NAME = "perl-Config-MVP-Reader-INI-2.101465-1.3.noarch.rpm"
RPM_HASH = "c163b0556320d41c0dfb4728b0c0a25384561c1e1f3891c99d6300173e021c799627578403a7aae704e9d4f1d20da889b5e83123dfec67ffdfa6c8fe05c1e1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--MVP--Reader--INI \
perl-Config-MVP-Reader-INI"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Config--INI--Reader \
perl-Config--MVP \
perl-Config--MVP--Reader \
perl-Config--MVP--Reader--Findable--ByExtension \
perl-Moose \
perl-parent"

inherit rpm
