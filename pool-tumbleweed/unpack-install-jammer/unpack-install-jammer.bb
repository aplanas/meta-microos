SUMMARY = "Pulls files out of InstallJammer generated executable installers"
DESCRIPTION = "It will search through your binary install blob, identify and extract the files \
buried within and drop them in a local directory. No higher permissions required, \
the only thing that is executed is the Perl script which lives up to Perl's \
reputation of easy inspection."
LICENSE = "GPL-3.0"

PV = "0.2.0"

RPM_NAME = "unpack-install-jammer-0.2.0-1.10.noarch.rpm"
RPM_HASH = "12650d73c8337496eccba35e4afcc510df87fa138027430f545c1cb40cb110385098d51201305f7c82440bae5d9cebc2e9e38a48138239b96a0ab565ae9f03d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unpack-install-jammer"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
perl-Compress-Raw-Lzma \
perl-Data-Dump \
perl-File-HomeDir \
perl-Modern-Perl \
perl-Term-ProgressBar"

inherit rpm
