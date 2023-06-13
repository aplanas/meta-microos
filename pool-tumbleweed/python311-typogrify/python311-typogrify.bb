SUMMARY = "Typography related template filters for Django & Jinja2 applications"
DESCRIPTION = "This application provides a set of custom filters for the Django template system \
which automatically apply various transformations to plain text in order to yield \
typographically-improved HTML."
LICENSE = "BSD-3-Clause"

PV = "2.0.7"

RPM_NAME = "python311-typogrify-2.0.7-1.11.noarch.rpm"
RPM_HASH = "5a4030f0b6985ab214e48cce39baa4163dd1fecdd629a5500906ac0bbed032f660d3a8ff0f1c9b8a98778686b70e21f6a7ab79be9e0c4511c6da4f9dadcca32f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(typogrify) \
python311-typogrify \
python3dist(typogrify)"

RDEPENDS:${PN} += "python(abi) \
python311-smartypants"

inherit rpm
