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

RPM_NAME = "perl-Gravatar-URL-1.07-1.21.noarch.rpm"
RPM_HASH = "cfc16015c8bbc79c4117b943e3af9bd811c7b577edae8a4dd6fa34a32496b4f17b43a32eb9ac89902b9e8d8592cebd15fe6009be522b6787488fbc9b5a08967c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Gravatar--URL \
perl-Gravatar-URL \
perl-Libravatar--URL \
perl-Unicornify--URL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.36.1 \
perl-Digest--SHA \
perl-Net--DNS \
perl-URI--Escape \
perl-parent"

inherit rpm
