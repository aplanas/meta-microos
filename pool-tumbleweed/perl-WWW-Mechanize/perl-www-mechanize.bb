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

RPM_NAME = "perl-WWW-Mechanize-2.17-1.3.noarch.rpm"
RPM_HASH = "b8f1e29e4291d29c950a74786850c0c10687a22df0c5a94e318c6259707da6e907e46deba3b0fb16f8d9ceadaf3f7e5343b4bce0898768689e9623aff8663970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-WWW--Mechanize \
perl-WWW--Mechanize--Image \
perl-WWW--Mechanize--Link \
perl-WWW-Mechanize"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.38.0 \
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
