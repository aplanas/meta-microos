SUMMARY = "Pack Your Dependencies Onto Your Script File"
DESCRIPTION = "pack your dependencies onto your script file"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.010008"

RPM_NAME = "perl-App-FatPacker-0.010008-1.17.noarch.rpm"
RPM_HASH = "e9ad984f2ef277e0a4f6002310e928ea03a9292156b22171d63f04473f5b92a0ac70468869b58c6f03c21a29a0b31d588146d70e069273a8d99b81eec612c6b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--FatPacker \
perl-App--FatPacker--Trace \
perl-App-FatPacker"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
