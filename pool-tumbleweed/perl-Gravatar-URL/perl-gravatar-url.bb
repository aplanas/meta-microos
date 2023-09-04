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

RPM_NAME = "perl-Gravatar-URL-1.07-1.22.noarch.rpm"
RPM_HASH = "653cde2f6a920f00090621f022c9f42c3a1ac6260fee055b864e0dd66e30f3873e26574094848d70f31ddd00389baac906770c837e1b6c2a0145376db5806287"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gravatar--URL \
perl-Gravatar-URL \
perl-Libravatar--URL \
perl-Unicornify--URL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.38.0 \
perl-Digest--SHA \
perl-Net--DNS \
perl-URI--Escape \
perl-parent"

inherit rpm
