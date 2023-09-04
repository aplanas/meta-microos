SUMMARY = "Grep-Like Text Finder Perl Module"
DESCRIPTION = "App::Ack is a grep-like tool tailored to working with large trees of source \
code."
LICENSE = "Artistic-2.0"

PV = "3.7.0"

RPM_NAME = "perl-App-Ack-3.7.0-1.3.noarch.rpm"
RPM_HASH = "acfb48cb665805e53a3353eb5f3e23e2a76069de0ddaf7f35b1c78efc4313f24493adb012bd9cf834e7fc9aca0a06e971e1cda13e58182b42ec0b3df1654c1c0"
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
