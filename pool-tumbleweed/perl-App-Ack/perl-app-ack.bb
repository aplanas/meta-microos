SUMMARY = "Grep-Like Text Finder Perl Module"
DESCRIPTION = "App::Ack is a grep-like tool tailored to working with large trees of source \
code."
LICENSE = "Artistic-2.0"

PV = "3.7.0"

RPM_NAME = "perl-App-Ack-3.7.0-1.2.noarch.rpm"
RPM_HASH = "dba43046e3378e0c3f98f02915dc81195854cddfb78eab1c9d53b45740b73e3ef4bbc0d6510734f6b5685db992551bd4f170bfb67a0d7b0c2b3b7cf2a12186c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Ack \
perl-App--Ack--ConfigDefault \
perl-App--Ack--ConfigFinder \
perl-App--Ack--ConfigLoader \
perl-App--Ack--File \
perl-App--Ack--Files \
perl-App--Ack--Filter \
perl-App--Ack--Filter--Collection \
perl-App--Ack--Filter--Default \
perl-App--Ack--Filter--Extension \
perl-App--Ack--Filter--ExtensionGroup \
perl-App--Ack--Filter--FirstLineMatch \
perl-App--Ack--Filter--Inverse \
perl-App--Ack--Filter--Is \
perl-App--Ack--Filter--IsGroup \
perl-App--Ack--Filter--IsPath \
perl-App--Ack--Filter--IsPathGroup \
perl-App--Ack--Filter--Match \
perl-App--Ack--Filter--MatchGroup \
perl-App-Ack"

RDEPENDS:${PN} += "perl-File--Next \
perl-base"

inherit rpm
