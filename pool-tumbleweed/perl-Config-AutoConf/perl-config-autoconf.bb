SUMMARY = "Module to implement some of AutoConf macros in pure perl"
DESCRIPTION = "Config::AutoConf is intended to provide the same opportunities to Perl \
developers as at http://www.gnu.org/software/autoconf/ does for Shell \
developers. \
 \
As Perl is the second most deployed language (mind: every Unix comes with \
Perl, several mini-computers have Perl and even lot's of Windows machines \
run Perl software - which requires deployed Perl there, too), this gives \
wider support than Shell based probes. \
 \
The API is leaned against GNU Autoconf, but we try to make the API \
(especially optional arguments) more Perl'ish than m4 abilities allow to \
the original."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.320"

RPM_NAME = "perl-Config-AutoConf-0.320-1.10.noarch.rpm"
RPM_HASH = "8610769695717cf6646623107d4cd7b7376273f012263b7ae305a830227bd4af81a186e9f5f6c32d82f4cce28ecf6734b89e2980cd8d991fd29cc3907720aab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--AutoConf \
perl-Config-AutoConf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny"

inherit rpm
