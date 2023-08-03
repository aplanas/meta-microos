SUMMARY = "The World-Wide Web library for Perl"
DESCRIPTION = "The World-Wide Web library for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "6.720.0"

RPM_NAME = "perl-libwww-perl-6.720.0-1.1.noarch.rpm"
RPM_HASH = "0e1636f8d55f00f09556f92950762356e36dc65b757b07fd0e9a871ce70f05116fe6cd5cdd37b81770cd71746b105be4b30db625aec6ab0f69b7427ab7cbc243"
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
