SUMMARY = "Pulls files out of InstallJammer generated executable installers"
DESCRIPTION = "It will search through your binary install blob, identify and extract the files \
buried within and drop them in a local directory. No higher permissions required, \
the only thing that is executed is the Perl script which lives up to Perl's \
reputation of easy inspection."
LICENSE = "GPL-3.0"

PV = "0.2.0"

RPM_NAME = "unpack-install-jammer-0.2.0-1.9.noarch.rpm"
RPM_HASH = "81b60d19541f2c50638d3304c9893a38a7598400dd08511fe35debd295c5d6294dcf8e16776fed10362603b1713cd67230540e84de3d0deacdba8f3d4c723809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unpack-install-jammer"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Compress-Raw-Lzma \
perl-Data-Dump \
perl-File-HomeDir \
perl-Modern-Perl \
perl-Term-ProgressBar"

inherit rpm
