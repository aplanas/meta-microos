SUMMARY = "Write command line apps with less suffering"
DESCRIPTION = "App::Cmd is intended to make it easy to write complex command-line \
applications without having to think about most of the annoying things \
usually involved. \
 \
For information on how to start using App::Cmd, see App::Cmd::Tutorial."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.335"

RPM_NAME = "perl-App-Cmd-0.335-1.3.noarch.rpm"
RPM_HASH = "4fc4a03863c4e7734662644706c0bb516ba8e2a30fb2570e9fc2a333abb7c8daa1d10b1023d8abdf4a51ee8322e37b731c41fa4b3a21d658be5462001add9064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Cmd \
perl-App--Cmd--ArgProcessor \
perl-App--Cmd--Command \
perl-App--Cmd--Command--commands \
perl-App--Cmd--Command--help \
perl-App--Cmd--Command--version \
perl-App--Cmd--Plugin \
perl-App--Cmd--Setup \
perl-App--Cmd--Simple \
perl-App--Cmd--Subdispatch \
perl-App--Cmd--Subdispatch--DashedStyle \
perl-App--Cmd--Tester \
perl-App--Cmd--Tester--CaptureExternal \
perl-App--Cmd--Tester--Exited \
perl-App--Cmd--Tester--Result \
perl-App-Cmd"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Capture--Tiny \
perl-Class--Load \
perl-Data--OptList \
perl-Getopt--Long \
perl-Getopt--Long--Descriptive \
perl-IO--TieCombine \
perl-Module--Pluggable--Object \
perl-Pod--Usage \
perl-String--RewritePrefix \
perl-Sub--Exporter \
perl-Sub--Exporter--Util \
perl-Sub--Install \
perl-experimental \
perl-parent"

inherit rpm
