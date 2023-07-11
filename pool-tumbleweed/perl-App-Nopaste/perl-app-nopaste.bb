SUMMARY = "Easy access to any pastebin"
DESCRIPTION = "Pastebins (also known as nopaste sites) let you post text, usually code, \
for public viewing. They're used a lot in IRC channels to show code that \
would normally be too long to give directly in the channel (hence the name \
nopaste). \
 \
Each pastebin is slightly different. When one pastebin goes down (I'm \
looking at you, http://paste.husk.org), then you have to find a new one. \
And if you usually use a script to publish text, then it's too much hassle. \
 \
This module aims to smooth out the differences between pastebins, and \
provides redundancy: if one site doesn't work, it just tries a different \
one. \
 \
It's also modular: you only need to put on CPAN a \
App::Nopaste::Service::Foo module and anyone can begin using it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.013"

RPM_NAME = "perl-App-Nopaste-1.013-1.16.noarch.rpm"
RPM_HASH = "5e194d937e50c7fcc2af0a57f2bb86c08ad372828526b570140196b04145252ff36a256c0ef8bce34cff8be9c61f6014cdc1e3d088df54221a23d8c933a44b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Nopaste \
perl-App--Nopaste--Command \
perl-App--Nopaste--Service \
perl-App--Nopaste--Service--Codepeek \
perl-App--Nopaste--Service--Debian \
perl-App--Nopaste--Service--Gist \
perl-App--Nopaste--Service--GitLab \
perl-App--Nopaste--Service--Mojopaste \
perl-App--Nopaste--Service--PastebinCom \
perl-App--Nopaste--Service--Pastie \
perl-App--Nopaste--Service--Shadowcat \
perl-App--Nopaste--Service--Snitch \
perl-App--Nopaste--Service--SusePaste \
perl-App--Nopaste--Service--Ubuntu \
perl-App--Nopaste--Service--ssh \
perl-App-Nopaste"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.36.1 \
perl-Browser--Open \
perl-Class--Load \
perl-Getopt--Long--Descriptive \
perl-JSON--MaybeXS \
perl-LWP--UserAgent \
perl-Module--Pluggable \
perl-Module--Runtime \
perl-Path--Tiny \
perl-URI--Escape \
perl-WWW--Mechanize \
perl-namespace--clean \
perl-parent"

inherit rpm
