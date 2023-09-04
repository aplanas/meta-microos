SUMMARY = "Perl extension for easily overriding subroutines"
DESCRIPTION = "Perl extension for easily overriding subroutines"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.09"

RPM_NAME = "perl-Sub-Override-0.09-5.29.noarch.rpm"
RPM_HASH = "6844c89964c4d93e91a6fe2c91b0ac7bfea68d9bab1723472dce88a1679d8575fb88435a4a9e56bcecb2a9feabc1bd06efed1ffdcc3ccb14de70cc0468b6b219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Sub--Override \
perl-Sub-Override"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Test--Fatal"

inherit rpm
