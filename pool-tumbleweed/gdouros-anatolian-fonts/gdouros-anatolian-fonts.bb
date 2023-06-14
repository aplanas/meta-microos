SUMMARY = "Anatolian Hieroglyphs"
DESCRIPTION = "Anatolian is a work-font, encoding Anatolian Hieroglyphs in F200 - F4FF of \
the Private Use Area of the BMP. There are no plans to improve or expand it."
LICENSE = "SUSE-Permissive"

PV = "5.17"

RPM_NAME = "gdouros-anatolian-fonts-5.17-1.17.noarch.rpm"
RPM_HASH = "97e9bd7dc5a81bfbc32dc2cc8ac242e1f7ac1c4b8c0ab0696329f662f4018bbd1361332fe15905d0c4f42136bd62678f43c76256a3ed3ede5cce36d71d368a93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "anatolian-fonts \
gdouros-anatolian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
