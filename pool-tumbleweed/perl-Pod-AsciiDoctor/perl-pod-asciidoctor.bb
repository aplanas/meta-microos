SUMMARY = "Convert from POD to AsciiDoc"
DESCRIPTION = "Convert from POD to AsciiDoc"
LICENSE = "Apache-2.0"

PV = "0.101003"

RPM_NAME = "perl-Pod-AsciiDoctor-0.101003-1.1.noarch.rpm"
RPM_HASH = "5ef098eecb97df505ded0493c9e60370aadf96b0c92aef926cdfa783b72b629e15a90ac175a34af38af8b41505d07804700ee5fd7a82c707c2f59576abf9229b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--AsciiDoctor \
perl-Pod-AsciiDoctor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Pod--Parser \
perl-parent"

inherit rpm
