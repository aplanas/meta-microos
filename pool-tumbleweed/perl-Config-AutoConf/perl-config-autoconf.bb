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

RPM_NAME = "perl-Config-AutoConf-0.320-1.9.noarch.rpm"
RPM_HASH = "cb8492bc412a5143928ba6c7b6c1dd5127c063ac13c72bf9c3f0a2b3b10d1df70721d143d7388bca20cbc0a3f3c3d61081d593e848a613366c680c71ec921f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--AutoConf \
perl-Config-AutoConf"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Capture--Tiny"

inherit rpm
