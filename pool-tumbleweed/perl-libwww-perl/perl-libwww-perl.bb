SUMMARY = "The World-Wide Web library for Perl"
DESCRIPTION = "The World-Wide Web library for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.71"

RPM_NAME = "perl-libwww-perl-6.71-1.1.noarch.rpm"
RPM_HASH = "79e3b8943471d16b6b0719925ebf94fdb45433f90e339649c1ae78392ebdd3b5148d94da23ddd6a0e5828d5f410d2374df844745ad9ee65fa444de00812666e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-LWP \
perl-LWP--Authen--Basic \
perl-LWP--Authen--Digest \
perl-LWP--Authen--Ntlm \
perl-LWP--ConnCache \
perl-LWP--Debug \
perl-LWP--Debug--TraceHTTP \
perl-LWP--DebugFile \
perl-LWP--MemberMixin \
perl-LWP--Protocol \
perl-LWP--Protocol--cpan \
perl-LWP--Protocol--data \
perl-LWP--Protocol--file \
perl-LWP--Protocol--ftp \
perl-LWP--Protocol--gopher \
perl-LWP--Protocol--http \
perl-LWP--Protocol--loopback \
perl-LWP--Protocol--mailto \
perl-LWP--Protocol--nntp \
perl-LWP--Protocol--nogo \
perl-LWP--RobotUA \
perl-LWP--Simple \
perl-LWP--UserAgent \
perl-libwww-perl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Encode--Locale \
perl-File--Listing \
perl-HTML--Entities \
perl-HTML--HeadParser \
perl-HTTP--CookieJar--LWP \
perl-HTTP--Cookies \
perl-HTTP--Date \
perl-HTTP--Negotiate \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-HTTP--Response \
perl-HTTP--Status \
perl-LWP--MediaTypes \
perl-Module--Load \
perl-Net--HTTP \
perl-Try--Tiny \
perl-URI \
perl-URI--Escape \
perl-WWW--RobotRules \
perl-parent"

inherit rpm
