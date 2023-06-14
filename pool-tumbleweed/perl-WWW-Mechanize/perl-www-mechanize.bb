SUMMARY = "Handy web browsing in a Perl object"
DESCRIPTION = "'WWW::Mechanize', or Mech for short, is a Perl module for stateful \
programmatic web browsing, used for automating interaction with websites. \
 \
Features include: \
 \
* All HTTP methods \
* High-level hyperlink and HTML form support, without having to parse \
  HTML yourself \
* SSL support \
* Automatic cookies \
* Custom HTTP headers \
* Automatic handling of redirections \
* Proxies \
* HTTP authentication \
 \
Mech is well suited for use in testing web applications. If you use one of \
the Test::*, like Test::HTML::Lint modules, you can check the fetched \
content and use that as input to a test call."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.17"

RPM_NAME = "perl-WWW-Mechanize-2.17-1.1.noarch.rpm"
RPM_HASH = "adb5f72859d24a492e540acb925638c89477357dee16d10b17af612c44402862d926ae0a0fd29e0cf048c686578ecdb3de910cb95f942c9532b87fce7cdb86af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Mechanize \
perl-WWW--Mechanize--Image \
perl-WWW--Mechanize--Link \
perl-WWW-Mechanize"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.0 \
perl-HTML--Form \
perl-HTML--HeadParser \
perl-HTML--TokeParser \
perl-HTML--TreeBuilder \
perl-HTTP--Cookies \
perl-HTTP--Request \
perl-HTTP--Request--Common \
perl-LWP--UserAgent \
perl-URI--URL \
perl-URI--file"

inherit rpm
