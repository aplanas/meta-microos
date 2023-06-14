SUMMARY = "Make URLs for Gravatars from an email address"
DESCRIPTION = "A Gravatar is a Globally Recognized Avatar for a given email address. This \
allows you to have a global picture associated with your email address. You \
can look up the Gravatar for any email address by constructing a URL to get \
the image from gravatar.com. This module does that. \
 \
Examples of use include the author faces on http://search.cpan.org. \
 \
See http://gravatar.com for more info."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.07"

RPM_NAME = "perl-Gravatar-URL-1.07-1.20.noarch.rpm"
RPM_HASH = "fb9d4758278af60d5e5c77c906d3c5bb856f543e271232b467e966dea4ebc7404519ab60aa8ff7bed5c8e8f6ed3249f99e79fb08bf1dbe39dc5b4d1320876d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gravatar--URL \
perl-Gravatar-URL \
perl-Libravatar--URL \
perl-Unicornify--URL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.0 \
perl-Digest--SHA \
perl-Net--DNS \
perl-URI--Escape \
perl-parent"

inherit rpm
