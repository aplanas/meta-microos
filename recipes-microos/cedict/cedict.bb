SUMMARY = "Free Chinese-English Dictionary in EDICT Format"
DESCRIPTION = "This is a free Chinese-English dictionary that can be used, for \
example, with Gjiten. \
 \
The objective of the CEDICT project is to create an online, \
downloadable (as opposed to searchable-only) public-domain \
Chinese-English dictionary. For the most part, the project is modelled \
on Jim Breen's highly successful EDICT (Japanese-English dictionary) \
project and is intended to be a collaborative effort with users \
providing entries and corrections to the main file."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0+"

PV = "20141224"

RPM_NAME = "cedict-20141224-1.16.noarch.rpm"
RPM_HASH = "ad2935e806ffb4f967e4c8fb2581e42282d1df14ca04d80c6ae0eefac8c54abd1eb494249aad1e64c4b7ec6769e034550c3f903ef771ba65a79262ddb8e14210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cedict locale(gjiten:zh)"
RDEPENDS:${PN} += ""

inherit rpm
