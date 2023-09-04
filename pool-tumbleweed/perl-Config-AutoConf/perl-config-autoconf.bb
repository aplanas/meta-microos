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

RPM_NAME = "perl-Config-AutoConf-0.320-1.11.noarch.rpm"
RPM_HASH = "4352fe9156a1fe5aad36e90ef8865fb14c69a60ce1a8fe15ba25447fbc79852b1596cad29ef55cfab433b73531813b23c50ef35efd68f5d13add9dc83d537b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--AutoConf \
perl-Config-AutoConf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Capture--Tiny"

inherit rpm
